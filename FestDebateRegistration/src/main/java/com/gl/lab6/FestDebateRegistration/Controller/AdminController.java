package com.gl.lab6.FestDebateRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.lab6.FestDebateRegistration.Entity.Student;
import com.gl.lab6.FestDebateRegistration.dao.AdminDAO;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminDAO adminDAO;
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "admin-login";
	}

	@RequestMapping("/home")
	public String adminHome()
	{
		return "admin-home";
	}
	
	@RequestMapping("/addStudent")
	public String addCustomer(Model theModel)
	{
		
		Student theStudent=new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "add-student";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent)
	{
		adminDAO.saveStudent(theStudent);
		
		return null;
	}
}
