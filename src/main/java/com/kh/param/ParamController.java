package com.kh.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.PersonVO;

@Controller
public class ParamController {
	public static final String VIEW_PATH = "/WEB-INF/views/person/"; 
	
	@RequestMapping(value = {"/","/insert_form.do"})
	public String insert_form() {
		return VIEW_PATH + "insert_form.jsp";
	}
	
	//낱개 전송
	@RequestMapping("/insert_single.do")
	public String insert1(Model model, String name, int age, String tel) {
		PersonVO vo = new PersonVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		model.addAttribute("vo", vo);
	
		return VIEW_PATH + "insert_result.jsp";
	}
	
	//객체 전송
	@RequestMapping("insert_vo.do")
	public String insert2(Model model, PersonVO vo) {
		//파라미터로 넘어온 값을 vo에 속성이 일치하는 변수에 자동으로 추가
		//vo에 이미 있는 변수와 같은 이름의 파라미터가 만들어져 있다면
		//실행시 오류가 발생하므로 주의
		model.addAttribute("vo", vo);
		return VIEW_PATH + "insert_result.jsp";
	}
	
}

















