package com.example.practice.web.controller.regist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistController {

	/**
	 * 新規登録ページ表示
	 * @return
	 */
	@GetMapping("/regist")
	String index() {
		return "regist/index";
	}

	/**
	 * 登録確認
	 * @return
	 */
	@PostMapping("/regist/confirm")
	String login() {

		return "index";
	}
}
