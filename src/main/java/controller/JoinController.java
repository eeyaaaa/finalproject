package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.JoinServiceImpl;

@Controller
public class JoinController {
	private JoinServiceImpl service;	
	
	public void setService(JoinServiceImpl service) {
		this.service = service;
	}

	//이용약관 페이지 이동
	@RequestMapping("/join/step1")
	public String handleStep1() {

		return "join/step1";
	}
	
	//이용약관을 거치지 않고 회원가입 페이지로 직접 이동했을 경우 
	@RequestMapping(value="/join/step2", method=RequestMethod.GET)
	public String handleStep2() {
		
		return "redirect:/join/step1";
	}
	
	//이용약관 동의한 경우 회원가입 페이지로 이동
	@RequestMapping(value="/join/step2", method=RequestMethod.POST)
	public String handleStep2(Model model) {
	
		return "join/step2";		
	}
	
	//회원가입 email중복확인
	@RequestMapping(value="/join/emailCheck", method=RequestMethod.POST)
	@ResponseBody
	public int emailCheck(@RequestBody String id) {
		System.out.println("data들어옴");
		int result = service.Check(id);
		return result;
	}
	
	//회원가입페이지에서 입력한 값 전달받음
	@RequestMapping("/join/step3")
	public String handleStep3(@ModelAttribute("joinInfo") Model model) {
		
		
		return "/join/step3";
	}
}
