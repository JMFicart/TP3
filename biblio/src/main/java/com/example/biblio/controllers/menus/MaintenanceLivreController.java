package com.example.biblio.controllers.menus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livremaintenance")
public class MaintenanceLivreController {
    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayLivreMaintenance(){
        return "pages/livre/menuLivreMaintenance";
    }
}
