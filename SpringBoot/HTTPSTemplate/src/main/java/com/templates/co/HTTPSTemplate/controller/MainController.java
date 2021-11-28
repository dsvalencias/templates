/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.templates.co.HTTPSTemplate.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MainController {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Spring Boot + SSL (HTTPS)");
        model.addAttribute("msg", "Welcome to the SSL!");
        return "index";
    }
}
