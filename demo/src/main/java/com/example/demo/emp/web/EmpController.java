package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	
	@Autowired 
	EmpMapper empMapper;
	
	//@GetMapping , @PostMapping 제한적으로 정해진 경우만 사용 나머지 리퀘스트 매핑사용. 
	//get,post 모두 읽어드림(포괄개념)
//	@RequestMapping("/empList") 
	@RequestMapping(value = "/empList", method = RequestMethod.GET) //post,get 지정가능
	public String empList(Model model) {
		model.addAttribute("empList", empMapper.getEmpList(null));
		return "empList"; 
		//타임리프이기때문에 jsp가 아닌 html찾음
	}

}
