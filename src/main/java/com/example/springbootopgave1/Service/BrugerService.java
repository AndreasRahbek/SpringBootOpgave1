package com.example.springbootopgave1.Service;

import com.example.springbootopgave1.Model.Bruger;

import java.util.ArrayList;

public class BrugerService {
    private static ArrayList<Bruger> brugerListe = new ArrayList<>();

    public void opretBruger(Bruger bruger){
        brugerListe.add(bruger);
    }

    public ArrayList<Bruger> returnBrugerListe(){
        return brugerListe;
    }
}
