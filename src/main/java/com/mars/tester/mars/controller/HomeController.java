package com.mars.tester.mars.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
    public String home() {
        return "<html>"
        		+ "<head>"
        		+ "<title>Home Page</title>"
        		+ "</head>"
        		+ "<body>"
        		+ "<h1>Hello, World!</h1>"
        		+ "</body>"
        		+ "</html>";
    }
}
