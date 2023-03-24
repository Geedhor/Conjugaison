package Verbes.Groupe3;

import Verbes.Verbe;

public class VerbeGroupe3Oudre extends Verbe{

    public VerbeGroupe3Oudre(String v) {
        super(v);
    }

    public String getFin() {
        return "oudre";
    }


    public String terminaison1erePersonneSingulierIndicatifPresent() {
        return avantTerminaisonSingulierIndicatifPresent() + "s";
    }

    public String terminaison2emePersonneSingulierIndicatifPresent() {
        return avantTerminaisonSingulierIndicatifPresent() + "s";
    }

    public String terminaison3emePersonneSingulierIndicatifPresent() {
        return avantTerminaisonSingulierIndicatifPresent() + "t";
    }


    public String avantTerminaisonSingulierIndicatifPresent() { return "ou"; }

    public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
        return "olv";
    }

    public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
        return "olv";
    }

    //------------------------------------------------//

    public String avantTerminaisonIndicatifFutur() { return "oudr"; }

    //------------------------------------------------//


    public String terminaisonIndicatifPasseCompose() {
        return avantTerminaisonIndicatifPasseCompose() + "olu";
    }

    public String avantTerminaisonIndicatifPasseCompose() { return ""; }

}
