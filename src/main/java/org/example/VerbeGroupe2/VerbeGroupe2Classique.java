package org.example.VerbeGroupe2;

import org.example.Verbe.Verbe;

public class VerbeGroupe2Classique extends Verbe {

    public VerbeGroupe2Classique(String verbe){
        super(verbe);
        if(verbe.endsWith("ir")) {}
        else{throw new IllegalArgumentException("VerbeGroupe2: Verbe du mauvais groupe");}
    }
    public String ParticipePassé(){return "i";}
    public String ParticipePresent(){return "issant";}
    public String terminaisonPremierPersonneSingulier(){return "is";}

    public String terminaisonDeuxiemePersonneSingulier(){return "is";}

    public String terminaisonTroisiemePersonneSingulier(){return "it";}
    public String terminaisonPremierPersonnePluriel(){return "issons";}

    public String terminaisonDeuxiemePersonnePluriel(){return "issez";}

    public String terminaisonTroisiemePersonneSPluriel(){return "issent";}

    public String Terminaison() {
        return "ir";
    }

}
