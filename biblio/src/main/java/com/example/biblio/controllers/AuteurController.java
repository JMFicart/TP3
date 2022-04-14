package com.example.biblio.controllers;

import com.example.biblio.models.Auteur;
import com.example.biblio.models.AuteurForm;
import com.example.biblio.models.AuteurFormId;
import com.example.biblio.service.AuteurService;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/auteur")
public class AuteurController {
    private final AuteurService service;

    public AuteurController(AuteurService service) {
        this.service = service;
    }

//    // GET - http://localhost:8080/auteur
//    //    @RequestMapping(method = RequestMethod.GET, path="/auteur")
//    @GetMapping("")
//    public List<Auteur> getAll() {
//        return service.getAll();
//    }

    // GET - http://localhost:8080/auteur/id
    //    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public String displayOne(@PathVariable int id, Model model){
        Auteur a = service.getOne(id);
        model.addAttribute("auteur", a);
        return "pages/auteur/displayAuteurById";
    }

    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayAll(Model model){
        List<Auteur> list = service.getAll();
        model.addAttribute("auteur_liste", list);
        return "pages/auteur/displayAllAuteur";
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String handle(NoSuchElementException ex){
        return "pages/misc/404";
    }

    @GetMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String displayInsertForm(@ModelAttribute("auteur") AuteurForm form){
        return "forms/auteurform";
    }

    @PostMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String processInsert(@Valid @ModelAttribute("auteur") AuteurForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/auteurform";
        Auteur rslt = service.insert(form);
        return "redirect:/auteur/" + rslt.getIdAuteur();

    }

    @GetMapping("/select")
//    @PreAuthorize("isAuthenticated()")
    public String displaySelectForm(@ModelAttribute("auteur") AuteurFormId form){
        return "forms/auteuridform";
    }
}

