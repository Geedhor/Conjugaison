package Conjugaison.Indicatif;

import Conjugaison.Conjugaison;
import Verbes.Verbe;

public class ConjugaisonIndicatifFutur extends Conjugaison {

	public String conjuguer1erePersonneSingulier(Verbe v) {
		return v.conjugue1erePersonneSingulierIndicatifFutur();
	}

	public String conjuguer2emePersonneSingulier(Verbe v) {
		return v.conjugue2emePersonneSingulierIndicatifFutur();
	}

	public String conjuguer3emePersonneSingulier(Verbe v) {
		return v.conjugue3emePersonneSingulierIndicatifFutur();
	}

	public String conjuguer1erePersonnePluriel(Verbe v) {
		return v.conjugue1erePersonnePlurielIndicatifFutur();
	}
	
	public String conjuguer2emePersonnePluriel(Verbe v) {
		return v.conjugue2emePersonnePlurielIndicatifFutur();
	}
	
	public String conjuguer3emePersonnePluriel(Verbe v) {
		return v.conjugue3emePersonnePlurielIndicatifFutur();
	}
}
