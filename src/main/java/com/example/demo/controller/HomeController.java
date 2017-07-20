package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Msg;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		Msg msg = new Msg("测试标题", "测试内容", "只对管理员显示信息");
		model.addAttribute("msg", msg);

		return "index";
	}

}
