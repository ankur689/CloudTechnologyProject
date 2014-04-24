package com.myapple.myapp;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


 
@Controller
public class AppleController {
   
    @RequestMapping(value = "/sony", method = RequestMethod.GET)
    public String inputCustomer() {
    	// do something here
    	return "index";
    }
}