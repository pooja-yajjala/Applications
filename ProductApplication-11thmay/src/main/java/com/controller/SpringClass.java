package com.controller;
import com.bean.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringClass {
	@RequestMapping("/Submit")
	public String login() {
		return "Login";
		
	}
	@RequestMapping("/login")
	public String doProcess(@ModelAttribute("login") UserInfo info) {
		
		return "Success";
	}
	@RequestMapping("/product")
	public String addProduct() {
		return "Product";
	}
	@RequestMapping("/Register") 
	public String database(@ModelAttribute("pro") Beans b) {
		return "ProductDetails";
	}
	
	

}
