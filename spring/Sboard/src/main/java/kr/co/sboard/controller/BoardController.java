package kr.co.sboard.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.ArticleVo;
import kr.co.sboard.vo.FileVo;
import kr.co.sboard.vo.MemberVo;
import lombok.Value;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	@GetMapping(value={"/", "/index"})
	public String index(HttpSession sess) {
		MemberVo vo = (MemberVo) sess.getAttribute("sessMember");
		
		if(vo == null) {
			return "forward:/member/login";	
		}else {
			return "forward:/list";			
		}
	}

	@GetMapping("/list")
	public String list(String pg, Model model) {
		
		int currentPage = service.getCurrentPage(pg);
		int start = service.getLimitStart(currentPage);
		int total = service.selectCountTotal();
		int pageStartNum = service.getPageStartNum(total, start);
		int lastPageNum = service.getLastPageNum(total);
		int groups[] = service.getPageGroup(currentPage, lastPageNum);
		
		List<ArticleVo> articles = service.selectArticles(start);
		
		model.addAttribute("articles", articles);
		model.addAttribute("pageStartNum", pageStartNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPageNum", lastPageNum);
		model.addAttribute("groups", groups);
		
		return "/list";
	}
	
	@GetMapping("/view")
	public String view(int seq,Model model) {
		
		ArticleVo vo = service.selectArticle(seq);
		model.addAttribute(vo);
		
		return "/view";
	}
	
	@GetMapping("/write")
	public String write() {
		return "/write";
	}
	
	@PostMapping("/write")
	public String write(HttpServletRequest req, ArticleVo vo) {
		
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		
		// 작성글 Insert
		int seq = 0;

		if(vo.getFname().isEmpty()) {
			// 파일을 첨부 안했을때
			vo.setFile(0);
			seq = service.insertArticle(vo);
		}else {
			// 파일을 첨부 했을때
			vo.setFile(1);
			seq = service.insertArticle(vo);
			FileVo fvo = service.fileUpload(vo.getFname(), seq);
			service.insertFile(fvo);
		}
		
		return "redirect:/list";
	}
	@GetMapping("/fileDownload")
	public String fileDownload() {
		
		File file = new File("src/main/resources/static/file/");
		String path = file.getAbsolutePath()+"/"+"파일명";
		
		try {
			byte[] fileByte = FileUtils.readFileToByteArray(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@GetMapping("/modify")
	public String modify() {
		return "/modify";
	}
	
}