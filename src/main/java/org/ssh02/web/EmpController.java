package org.ssh02.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssh02.pojo.Emp;
import org.ssh02.service.EmpService;

@Controller
public class EmpController {

	@Resource
	private EmpService es;

	@RequestMapping("/abc")
	public String fn1(ModelMap map) {
		List<Emp> el = es.selectAll();
		map.put("el", el);
		
		System.out.println(el);
		return "emplist";
	}
}
