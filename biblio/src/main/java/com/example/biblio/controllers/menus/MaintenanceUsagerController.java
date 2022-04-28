package com.example.biblio.controllers.menus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usagermaintenance")
public class MaintenanceUsagerController {
    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayUsagerMaintenance(){
        return "pages/usager/menuUsagerMaintenance";
    }
}
