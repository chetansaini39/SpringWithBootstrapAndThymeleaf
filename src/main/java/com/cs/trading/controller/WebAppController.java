package com.cs.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	private String appMode;
	@Autowired
	public WebAppController(Environment environment) {
		appMode=environment.getProperty("app-mode");
	}
	
	@RequestMapping("/")
	public String index(Model model)
	{
		model.addAttribute("mode", appMode);
		model.addAttribute("appName","Trading App Ver1");
		return "index";
	}
	@RequestMapping("/index2")
	public String index2(Model model)
	{
		model.addAttribute("mode", appMode);
		return "index2";
	}
}
