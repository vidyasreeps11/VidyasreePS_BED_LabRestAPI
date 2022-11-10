package com.gl.lab6.FestDebateRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/login")
	public String studentPage()
	{
		return "student-login";
	}

	@RequestMapping("/home")
	public String studentHome()
	{
		return "student-home";
	}
}
