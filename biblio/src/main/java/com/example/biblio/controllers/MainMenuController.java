package com.example.biblio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bibliomenu")
public class MainMenuController {
    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayMenu(){
        return "pages/misc/mainMenu";
    }
}
