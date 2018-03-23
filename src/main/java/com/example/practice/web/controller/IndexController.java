package com.example.practice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	/**
	 * トップページ表示
	 * @return
	 */
	@RequestMapping("/")
	String index() {
		return "index";
	}

}
