package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpVO;

@Controller
@CrossOrigin(origins = "*") //2개서버 연동(vue,sprinig)
//실제로 사용X 보안이 풀어진상태
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
	
	@RequestMapping(value = "/empInfoList", method = RequestMethod.GET)
	@ResponseBody
	public List<EmpVO> empInfoList(Model model){
		return empMapper.getEmpList(null);
	}

}
