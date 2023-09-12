package com.assignment.OmikujuForm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
		
	@RequestMapping("/omikuji")
	public String FormPage() {
		
		return "form.jsp";
	}
	
	@RequestMapping("/omikuji/show")
	public String send(
			@RequestParam(value="pick") String pick ,@RequestParam(value="city") String city,
			@RequestParam(value="profision") String profision,@RequestParam(value="type") String type,
			@RequestParam(value="Say") String Say,@RequestParam(value="nameperson") String nameperson,
			HttpSession session) {
		
		session.setAttribute("pick", pick);
		session.setAttribute("profision", profision);
		session.setAttribute("city", city);
		session.setAttribute("type", type);
		session.setAttribute("Say", Say);
		session.setAttribute("nameperson", nameperson);
		
		return "omikuji.jsp";
	}
	
	
}
