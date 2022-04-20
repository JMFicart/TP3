package com.example.biblio.controllers;

import com.example.biblio.models.*;
import com.example.biblio.service.LivreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/livre")
public class LivreController {
    private final LivreService service;

    public LivreController(LivreService service) {
        this.service = service;
    }

    // GET - http://localhost:8080/livre/id
    //    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public String displayOne(@PathVariable Long id, Model model){
        Livre l = service.getOne(id);
        model.addAttribute("livre", l);
//        return "pages/auteur/displayAuteurById";
        return "forms/livreidform";
    }

    @PostMapping("/{id}")
//    @PreAuthorize("isAuthenticated()")
    public String processUpdate(@Valid @ModelAttribute("livre") LivreForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/livreform";
        Livre rslt = service.update(form);
        return "redirect:/livre/" + rslt.getIdAuteur();
    }

    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayAll(Model model){
        List<Livre> list = service.getAll();
        model.addAttribute("livre_liste", list);
        return "pages/livre/displayAllLivre";
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String handle(NoSuchElementException ex){
        return "pages/misc/404";
    }

    @GetMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String displayInsertForm(@ModelAttribute("livre") LivreForm form){
        return "forms/livreform";
    }

    @PostMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String processInsert(@Valid @ModelAttribute("livre") LivreForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/livreform";
        Livre rslt = service.insert(form);
        return "redirect:/livre/" + rslt.getIdLivre();
    }

    @GetMapping("/select")
//    @PreAuthorize("isAuthenticated()")
    public String displaySelectForm(@ModelAttribute("livre") LivreFormId form){
        return "forms/livreidform";
    }

    @GetMapping("/update")
//    @PreAuthorize("isAuthenticated()")
    public String displayUpdateForm(@ModelAttribute("livre") LivreFormId form){
        return "forms/livreidform";
    }
}
