package com.nawfal.HelloHuman;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);

	}

	@RequestMapping("/")
	public String index(@RequestParam(value = "name") String name, @RequestParam(value = "last_name") String last_name){
		   
		
			return "Hollo " + name+" "+last_name;
		
	}

}
