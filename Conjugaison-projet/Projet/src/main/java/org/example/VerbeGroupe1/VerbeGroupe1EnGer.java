package org.example.VerbeGroupe1;

public class VerbeGroupe1EnGer extends VerbeGroupe1Classique{

    public VerbeGroupe1EnGer(String verbe) {
        super(verbe);
        if(verbe.endsWith("ger")){}
        else{throw new IllegalArgumentException("VerbeGroupe1Particulier: Verbe du mauvais groupe");}
    }
    public String ParticipePresent() {return "eant";}
    public String terminaisonPremierPersonnePluriel() {return "eons";}

    public String terminaisonDeuxiemePersonnePluriel() {return "ez";}

    public String terminaisonTroisiemePersonneSPluriel() {return "eont";}

}
