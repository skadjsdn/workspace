package kr.co.farmstory.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/board/list")
	public String list(Model model, String group, String cate) {
		
		model.addAttribute("group",group);
		model.addAttribute("cate", cate);
		return "/board/list";
	}
	
	@GetMapping("/board/write")
	public String write(Model model, String group) {
		
		model.addAttribute("group",group);
		return "/board/write";
	}
	@GetMapping("/board/view")
	public String view(Model model, String group) {
		
		model.addAttribute("group",group);
		return "/board/view";
	}
	@GetMapping("/board/modify")
	public String modify(Model model, String group) {
		
		model.addAttribute("group",group);
		return "/board/modify";
	}
	

}
