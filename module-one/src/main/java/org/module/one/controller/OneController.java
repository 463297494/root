package org.module.one.controller;

import org.module.two.service.TwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OneController {
	@Autowired
	private TwoService twoService;

	@RequestMapping("/index")
	@ResponseBody
	public String msg(String msg) {
		return twoService.msg(msg);
	}

	@RequestMapping("/test")
	@ResponseBody
	public String cc() {
		return "test success123...";
	}
}
