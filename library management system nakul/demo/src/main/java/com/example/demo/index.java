package com.example.demo;



import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

	
	@RequestMapping("addUser")

	public String first(User user)
	{
		return "new";
	}
}
