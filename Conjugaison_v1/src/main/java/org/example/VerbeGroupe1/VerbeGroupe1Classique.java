package main.java.org.example.VerbeGroupe1;

import main.java.org.example.Verbe.Verbe;

public class VerbeGroupe1Classique extends Verbe {

    public VerbeGroupe1Classique(String verbe){
        super(verbe);
        if(verbe.endsWith("er")) {}
        else{throw new IllegalArgumentException("VerbeGroupe1: le verbe est du mauvais groupe");}
    }

    public String ParticipePassé(){return "é";}
    public String ParticipePresent(){return "ant";}


    public String terminaisonPremierPersonneSingulier(){return "e";}

    public String terminaisonDeuxiemePersonneSingulier(){return "es";}

    public String terminaisonTroisiemePersonneSingulier(){return "e";}
    public String terminaisonPremierPersonnePluriel(){return "ons";}
    public String terminaisonDeuxiemePersonnePluriel(){return "ez";}
    public String terminaisonTroisiemePersonneSPluriel(){return "ent";}

    @Override
    public String Terminaison() {
        return "er";
    }
}
