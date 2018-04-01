package com.springtutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("Creating home controller");
    }

    @RequestMapping("/")
    public String showPage()
    {
        System.out.println("Showing page...");
        return "main-menu";
    }
}
