package Verbes.Groupe3;

import Verbes.Verbe;

public class VerbeGroupe3Ettre extends Verbe {

    public VerbeGroupe3Ettre(String v) {
        super(v);
    }

    public String getFin() {
        return "ettre";
    }


    public String terminaison1erePersonneSingulierIndicatifPresent() {
        return avantTerminaisonSingulierIndicatifPresent() + "ts";
    }

    public String terminaison2emePersonneSingulierIndicatifPresent() {
        return avantTerminaisonSingulierIndicatifPresent() + "ts";
    }

    public String terminaison3emePersonneSingulierIndicatifPresent() {
        return avantTerminaisonSingulierIndicatifPresent() + "t";
    }


    public String avantTerminaisonSingulierIndicatifPresent() {
        return "e";
    }

    public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
        return "ett";
    }

    public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
        return "ett";
    }
}
