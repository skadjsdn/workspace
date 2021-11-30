package kr.co.kmarket2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.kmarket2.service.MemberService;
import kr.co.kmarket2.vo.MemberTermsVo;
import kr.co.kmarket2.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@GetMapping("/member/join")
	public String join() {
		
		return "/member/join";
	}

	@GetMapping("/member/login")
	public String login() {
		
		return "/member/login";
	}
	@GetMapping("/member/register")
	public String register() {
		
		
		
		
		return "/member/register";
	}
	@PostMapping("/member/register")
	public String register(HttpServletRequest req, MemberVo vo) {
		
		String ip = req.getRemoteAddr();
		
		vo.setIp(ip);
		
		service.insertMember(vo);
		return "redirect:/member/login";
	}
	@GetMapping("/member/register-seller")
	public String register_seller() {
		
		return "/member/register-seller";
	}

	@GetMapping("/member/signup")
	public String signup(Model model, int type) {
		
		MemberTermsVo vo = service.selectTerms();	
		
		model.addAttribute(vo);
		model.addAttribute("type", type);
		
		return "/member/signup";
	}
}
