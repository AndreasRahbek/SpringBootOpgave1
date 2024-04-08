package com.example.springbootopgave1.Model;

public class Bruger {
    private String navn;
    private String email;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "navn='" + navn + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
