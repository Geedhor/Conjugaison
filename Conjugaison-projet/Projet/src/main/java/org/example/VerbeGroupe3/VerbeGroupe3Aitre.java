package org.example.VerbeGroupe3;

import org.example.Verbe.Verbe;

public class VerbeGroupe3Aitre extends Verbe {

    public VerbeGroupe3Aitre(String verbe){
        super(verbe);
        if(verbe.endsWith("aitre")) {}
        else{throw new IllegalArgumentException("VerbeGroupe3Aitre: Verbe du mauvais groupe");}
    }

    public String ParticipePassé() {return "u";}
    public String ParticipePresent() {return "aissant";}
    public String terminaisonPremierPersonneSingulier() {return "ais";}

    public String terminaisonDeuxiemePersonneSingulier() {return "ais";}

    public String terminaisonTroisiemePersonneSingulier() {return "ait";}
    public String terminaisonPremierPersonnePluriel() {return "aissons";}

    public String terminaisonDeuxiemePersonnePluriel() {return "aissez";}

    public String terminaisonTroisiemePersonneSPluriel() {return "aissent";}

    public String Terminaison() {
        return "aitre";
    }
}
