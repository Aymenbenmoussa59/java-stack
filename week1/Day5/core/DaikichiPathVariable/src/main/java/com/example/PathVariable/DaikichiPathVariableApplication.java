package com.example.PathVariable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVariableApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariableApplication.class, args);
	}
	
	@RequestMapping("/{value1}")
    public String today(@PathVariable("value1") String Value1) {
            return Value1+" you will find luck in all your endeavors!";
    }
	
	
	
	@RequestMapping("/{value1}/{value2}")
    public String index(@PathVariable("value1") String Value1,@PathVariable("value2") String Value2) {
            return "Congratulations! You will soon "+ Value1 +" to "+ Value2 +"!";
    }
	
	@RequestMapping("/lotto/{value1}")
    public String takeinteger(@PathVariable("value1") int Value1) {
		if(Value1 % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
    }
}
