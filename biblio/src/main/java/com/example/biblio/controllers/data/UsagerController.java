package com.example.biblio.controllers.data;

import com.example.biblio.models.usager.Usager;
import com.example.biblio.models.usager.UsagerForm;
import com.example.biblio.models.usager.UsagerFormId;
import com.example.biblio.service.UsagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/usager")
public class UsagerController {
    private final UsagerService service;

    public UsagerController(UsagerService service) {
        this.service = service;
    }

    // GET - http://localhost:8080/livre/id
    //    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public String displayOne(@PathVariable Long id, Model model){
        Usager u = service.getOne(id);
        model.addAttribute("usager", u);
        return "forms/usager/usageridform";
    }

    @PostMapping("/{id}")
//    @PreAuthorize("isAuthenticated()")
    public String processUpdate(@Valid @ModelAttribute("usager") UsagerForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/usager/usagerform";
        Usager rslt = service.update(form);
        return "redirect:/usager/" + rslt.getIdUsager();
    }

    @GetMapping
//    @PreAuthorize("permitAll()")
    public String displayAll(Model model){
        List<Usager> list = service.getAll();
        model.addAttribute("usager_liste", list);
        return "pages/usager/displayAllUsager";
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String handle(NoSuchElementException ex){
        return "pages/misc/404";
    }

    @GetMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String displayInsertForm(@ModelAttribute("usager") UsagerForm form){
        return "forms/usager/usagerform";
    }

    @PostMapping("/add")
//    @PreAuthorize("isAuthenticated()")
    public String processInsert(@Valid @ModelAttribute("usager") UsagerForm form, BindingResult binding){
        if (binding.hasErrors())
            return "forms/usager/usagerform";
        Usager rslt = service.insert(form);
        return "redirect:/usager/" + rslt.getIdUsager();
    }

    @GetMapping("/select")
//    @PreAuthorize("isAuthenticated()")
    public String displaySelectForm(@ModelAttribute("usager") UsagerFormId form){
        return "forms/usager/usageridform";
    }

    @GetMapping("/update")
//    @PreAuthorize("isAuthenticated()")
    public String displayUpdateForm(@ModelAttribute("usager") UsagerFormId form){
        return "forms/usager/usageridform";
    }
}
