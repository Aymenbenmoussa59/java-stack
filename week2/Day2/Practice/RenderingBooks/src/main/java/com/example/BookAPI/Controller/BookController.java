package com.example.BookAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BookAPI.Model.Book;
import com.example.BookAPI.Services.BookService;

@Controller
public class BookController {
	
	 private BookService bookService;
	 

	 @RequestMapping("/show/books/{id}")
	    public String display(@PathVariable("id") Long id, Model model) {
	        	Book onebook = bookService.findBook(id);
	        	model.addAttribute("onebook",onebook);
	        return "show.jsp";
}
}
