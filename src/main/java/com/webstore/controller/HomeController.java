package com.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/cart")
    public String cart(){
        return "cart";
    }
    
    @RequestMapping("/product-details")
    public String product_details(){
        return "product-details";
    }
    @RequestMapping("/shop")
    public String shop(){
        return "shop";
    }
    @RequestMapping("/checkout")
    public String checkout(){
        return "checkout";
    }
}
