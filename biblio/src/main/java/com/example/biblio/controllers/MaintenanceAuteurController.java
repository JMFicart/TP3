package com.example.biblio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auteurmaintenance")
public class MaintenanceAuteurController {
    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayAuteurMaintenance(){
        return "pages/auteur/menuAuteurMaintenance";
    }
}
