package com.springtutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String processFormV2(HttpServletRequest request, Model model)
    {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String message = "Yo! "+name;

        model.addAttribute("message",message);
        return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String processFormV3(@RequestParam("studentName") String studentName, Model model)
    {
        studentName = studentName.toUpperCase();
        String message = "Hi "+studentName;

        model.addAttribute("message",message);
        return "helloworld";
    }
}
