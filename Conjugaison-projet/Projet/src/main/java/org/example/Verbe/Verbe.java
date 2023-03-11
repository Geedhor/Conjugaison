package org.example.Verbe;
public abstract class Verbe {
    public String radical;
    public String[] var = {"je", "tu", "il", "nous", "vous","ils"};

    public Verbe(String verbe) {
            if(verbe.endsWith(Terminaison())) {radical = verbe.substring(0, verbe.length() - Terminaison().length());}// on  veut avoir er ir aitre indre etc...
    }

    public abstract String ParticipePassé();
    public abstract String ParticipePresent();
    public abstract String terminaisonPremierPersonneSingulier();
    public abstract String terminaisonDeuxiemePersonneSingulier();
    public abstract String terminaisonTroisiemePersonneSingulier();
    public abstract String terminaisonPremierPersonnePluriel();
    public abstract String terminaisonDeuxiemePersonnePluriel();
    public abstract String terminaisonTroisiemePersonneSPluriel();
    public abstract String Terminaison();


    public String conjugue1erePersonneSingulier() {return var[0] + " " + this.radical + this.terminaisonPremierPersonneSingulier() +"\r";}
    public String conjugueDeuxiemePersonneSingulier() {return var[1] + " " + this.radical + this.terminaisonDeuxiemePersonneSingulier() +"\r";}
    public String conjugueTroisiemePersonneSingulier() {return var[2] + " " + this.radical + this.terminaisonTroisiemePersonneSingulier() +"\r";}

    public String conjugue1erePersonnePluriel() {return var[3] + " " + this.radical + this.terminaisonPremierPersonnePluriel() + "\r";}
    public String conjugueDeuxiemePersonnePluriel() {return var[4] + " " + this.radical + this.terminaisonDeuxiemePersonnePluriel() + "\r";}
    public String conjugueTroisiemePersonnePluriel() {return var[5] + " " + this.radical + this.terminaisonTroisiemePersonneSPluriel() + "\r";}

    public String conjugueParticipePresent() {return "En " + this.radical + this.ParticipePresent() + "\r";}
    public String conjugueParticipePasse() {return this.radical + this.ParticipePassé() + "\r";}
}
