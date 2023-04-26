package Conjugaison.Indicatif;

import Conjugaison.Conjugaison;
import Verbes.Verbe;

public class ConjugaisonIndicatifPasseCompose extends Conjugaison {

    public String conjuguer1erePersonneSingulier(Verbe v) {
        return "ai " + v.conjugueIndicatifPasseCompose();
    }

    public String conjuguer2emePersonneSingulier(Verbe v) {
        return "as " + v.conjugueIndicatifPasseCompose();
    }

    public String conjuguer3emePersonneSingulier(Verbe v) {
        return "a " + v.conjugueIndicatifPasseCompose();
    }

    public String conjuguer1erePersonnePluriel(Verbe v) {
        return "avons " + v.conjugueIndicatifPasseCompose();
    }

    public String conjuguer2emePersonnePluriel(Verbe v) {
        return "avez " + v.conjugueIndicatifPasseCompose();
    }

    public String conjuguer3emePersonnePluriel(Verbe v) {
        return "ont " + v.conjugueIndicatifPasseCompose();
    }

}
