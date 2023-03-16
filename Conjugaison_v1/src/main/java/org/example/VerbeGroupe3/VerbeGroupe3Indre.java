package main.java.org.example.VerbeGroupe3;

import main.java.org.example.Verbe.Verbe;

public class VerbeGroupe3Indre extends Verbe {
    public VerbeGroupe3Indre(String verbe){
        super(verbe);
        if(verbe.endsWith("indre")) {}
        else{throw new IllegalArgumentException("VerbeGroupe3Indre: Verbe du mauvais groupe");}

    }

    public String ParticipePassé() {return "nt";}
    public String ParticipePresent() {return "gnant";}
    public String terminaisonPremierPersonneSingulier() {return "ns";}

    public String terminaisonDeuxiemePersonneSingulier() {return "ns";}

    public String terminaisonTroisiemePersonneSingulier() {return "nt";}
    public String terminaisonPremierPersonnePluriel() {return "gnons";}

    public String terminaisonDeuxiemePersonnePluriel() {return "gnez";}

    public String terminaisonTroisiemePersonneSPluriel() {return "gnent";}

    public String Terminaison() {
        return "ndre";
    }
}
