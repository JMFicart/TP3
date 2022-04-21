package com.example.biblio.controllers;

import com.example.biblio.models.*;
import com.example.biblio.service.EmpruntService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/emprunt")
public class EmpruntController {
    private final EmpruntService service;

    public EmpruntController(EmpruntService service) {
        this.service = service;
    }

    // GET - http://localhost:8080/emprunt/id
    //    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public String displayOne(@PathVariable Long id, Model model){
        Emprunt e = service.getOne(id);
        model.addAttribute("emprunt", e);
        return "forms/emprunt/empruntidform";
    }

    @PostMapping("/{id}")
//    @PreAuthorize("isAuthenticated()")
    public String processUpdate(@Valid @ModelAttribute("emprunt") EmpruntForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/emprunt/empruntform";
        Emprunt rslt = service.update(form);
        return "redirect:/emprunt/" + rslt.getIdEmprunt();
    }

    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayAll(Model model){
        List<Emprunt> list = service.getAll();
        model.addAttribute("emprunt_liste", list);
        return "pages/emprunt/displayAllEmprunt";
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String handle(NoSuchElementException ex){
        return "pages/misc/404";
    }

    @GetMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String displayInsertForm(@ModelAttribute("emprunt") EmpruntForm form){
        return "forms/emprunt/empruntform";
    }

    @PostMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String processInsert(@Valid @ModelAttribute("emprunt") EmpruntForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/emprunt/empruntform";
        Emprunt rslt = service.insert(form);
        return "redirect:/emprunt/" + rslt.getIdEmprunt();
    }

    @GetMapping("/select")
//    @PreAuthorize("isAuthenticated()")
    public String displaySelectForm(@ModelAttribute("emprunt") EmpruntFormId form){
        return "forms/emprunt/empruntidform";
    }

    @GetMapping("/update")
//    @PreAuthorize("isAuthenticated()")
    public String displayUpdateForm(@ModelAttribute("emprunt") EmpruntFormId form){
        return "forms/emprunt/empruntidform";
    }
}
