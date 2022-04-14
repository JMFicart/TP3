package com.example.biblio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maintenance")
public class MaintenanceMenuController {
    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayMenuMaintenance(){
        return "pages/misc/menuMaintenance";
    }
}
