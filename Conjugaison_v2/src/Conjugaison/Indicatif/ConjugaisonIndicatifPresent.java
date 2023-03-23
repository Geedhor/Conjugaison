package Conjugaison.Indicatif;

import Conjugaison.Conjugaison;
import Verbes.Verbe;

public class ConjugaisonIndicatifPresent extends Conjugaison {

	public String conjuguer1erePersonneSingulier(Verbe v) {
		return v.conjugue1erePersonneSingulierIndicatifPresent();
	}

	public String conjuguer2emePersonneSingulier(Verbe v) {
		return v.conjugue2emePersonneSingulierIndicatifPresent();
	}

	public String conjuguer3emePersonneSingulier(Verbe v) {
		return v.conjugue3emePersonneSingulierIndicatifPresent();
	}

	public String conjuguer1erePersonnePluriel(Verbe v) {
		return v.conjugue1erePersonnePlurielIndicatifPresent();
	}
	
	public String conjuguer2emePersonnePluriel(Verbe v) {
		return v.conjugue2emePersonnePlurielInficatifPresent();
	}
	
	public String conjuguer3emePersonnePluriel(Verbe v) {
		return v.conjuguer3emePersonnePlurielIndicatifPresent();
	}
}
