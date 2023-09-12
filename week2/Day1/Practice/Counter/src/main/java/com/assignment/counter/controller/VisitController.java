package com.assignment.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller

public class VisitController {
	
	@RequestMapping("/your_server")
	public String visitSite(HttpSession session) {
		var count=(int) session.getAttribute("count")+1;
		session.setAttribute("count",count);
		
		return "server.jsp";
	}
	
	
	@RequestMapping("/your_server/countercounter")
	public String increment(HttpSession session) {
		var count=(int) session.getAttribute("count")+2;
		session.setAttribute("count",count);
		
		return "server.jsp";
	}
	
	
	
	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session) {
			if(session.getAttribute("count")==null) {
				session.setAttribute("count", 0);
			}
		return "counter.jsp";
	}
	

	@RequestMapping("/your_server/Reset")
	public String Reset(HttpSession session) {
			
				session.setAttribute("count", 0);
			
		return "redirect:/your_server/counter";
	}
	
	
}
