package com.example.biblio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emprunt")
public class MaintenanceEmpruntController {
    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayEmpruntMaintenance(){
        return "pages/emprunt/menuEmpruntMaintenance";
    }
}
