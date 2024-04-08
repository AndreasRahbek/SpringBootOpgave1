package com.example.springbootopgave1.Controller;

import com.example.springbootopgave1.Model.Bruger;
import com.example.springbootopgave1.Service.BrugerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrugerController {
    BrugerService bs = new BrugerService();

    @GetMapping("/registrering")
    public String registreringsForm(Model model) {
        model.addAttribute("bruger", new Bruger());
        return "registrering";
    }

    @PostMapping("/registrering")
    public String registreringSubmit(@ModelAttribute Bruger bruger, Model model){
        model.addAttribute("Bruger", bruger);
        bs.opretBruger(bruger);
        return "result";
    }

}
