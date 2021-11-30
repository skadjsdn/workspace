package kr.co.farmstory.contoroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.farmstory.service.MemberService;
import kr.co.farmstory.vo.MemberVo;
import kr.co.farmstory.vo.TermsVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	@PostMapping("/member/login")
	public String login(HttpSession  sess, String uid, String pass) {
		
		MemberVo vo = service.selectMember(uid, pass);
		
		if(vo == null) {
			return "redirect:/member/login?success=100";
		}else {
			sess.setAttribute("sessMember", vo);
			return "redirect:/";
		}
		
	}
	@GetMapping("/member/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVo vo  = service.selectTerms();
		model.addAttribute(vo);
		
		return "/member/terms";
		
	}
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	@GetMapping("/member/checkUid")
	public String checkUid(String uid) {
		System.out.println("uid :" + uid);
		
		return "{'return':1}";
	}

}
