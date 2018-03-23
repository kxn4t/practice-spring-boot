package com.example.practice.web.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	/**
	 * ログインページ表示
	 * @return
	 */
	@GetMapping("/login")
	String index() {
		return "login/index";
	}

	/**
	 * ログイン処理
	 * @return
	 */
	@PostMapping("/login")
	String login() {

		return "index";
	}
}
