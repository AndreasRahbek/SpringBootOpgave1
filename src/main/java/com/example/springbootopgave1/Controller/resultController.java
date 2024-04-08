package com.example.springbootopgave1.Controller;

import com.example.springbootopgave1.Model.Bruger;
import com.example.springbootopgave1.Service.BrugerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

public class resultController {

    private BrugerService brugerService;

    @GetMapping("/result")
    public String resultForm(Model model) {
        model.addAttribute("brugerliste", brugerService.returnBrugerListe());
        return "result";
    }

    @PostMapping
    public String printBrugere(@ModelAttribute ArrayList<Bruger> brugerListe, Model model){
        model.addAttribute("brugerliste", brugerListe);
        return "result";
    }




}
