package com.example.practice.web.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		// 静的ファイルに対するアクセス制限は無視
		web.ignoring().antMatchers("/semantic/**", "/js/**", "/css/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				// アクセス制限をしないURL
				.antMatchers("/", "/login", "/regist").permitAll()
				// それ以外のページは認証なしの場合アクセス不可
				.anyRequest().authenticated()
				.and()
			// ログイン設定
			.formLogin()
				// 認証処理のURL
				.loginProcessingUrl("/login")
				// 認証処理のページ
				.loginPage("/login")
				// ユーザ名のパラメータ名を変更
				.usernameParameter("userid")
				// パスワードのパラメータ名を変更
				.passwordParameter("password")
				// 認証成功後の遷移先
				.defaultSuccessUrl("/menu")
				.and()
			// ログアウト設定
			.logout()
				// ログアウト処理のURL
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout**"))
				// ログアウト成功後の遷移先
				.logoutSuccessUrl("/")
				.permitAll();
	}

}
