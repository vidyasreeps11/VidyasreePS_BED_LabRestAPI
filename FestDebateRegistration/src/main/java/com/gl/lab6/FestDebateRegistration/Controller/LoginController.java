package com.gl.lab6.FestDebateRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String showLogin()
	{
		return "index";
	}

	@RequestMapping("/accessDenied")
	public String accessDeniedPage()
	{
		return "access-denied";
	}

}
