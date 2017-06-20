package com.ye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@RequestMapping("list")
	public String list() {
		System.out.println("访问成功");
		return "success";
	}

}
