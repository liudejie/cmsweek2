package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Gs;
import com.bw.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class EmpController {

	@Autowired
	EmpService emp;

	@RequestMapping("list")
	public String select(Model model, @RequestParam(defaultValue = "1") int pageNum, String keywords,
			String description, String name, String cp, String dz, Double zb, String cltime, String njtime, String zt,
			String bz) {

		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize);

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("keywords", keywords);
		map.put("description", description);
		map.put("name", name);
		map.put("cp", cp);
		map.put("dz", dz);
		map.put("zb", zb);
		map.put("cltime", cltime);
		map.put("njtime", njtime);
		map.put("zt", zt);
		map.put("bz", bz);
		
		List<Gs> select = emp.select(map);
		PageInfo<Gs> pageInfo = new PageInfo<Gs>(select);
		
		model.addAttribute("select", select);
		model.addAttribute("pageInfo", pageInfo);
		return "list";
	}
}
