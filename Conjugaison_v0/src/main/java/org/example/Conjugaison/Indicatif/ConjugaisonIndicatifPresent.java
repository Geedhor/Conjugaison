package org.example.Conjugaison.Indicatif;

import org.example.Conjugaison.Conjugaison;
import org.example.Verbes.Verbe;

public class ConjugaisonIndicatifPresent extends Conjugaison {

	public ConjugaisonIndicatifPresent(String t){
		super(t);
	}

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
		return v.conjugue2emePersonnePlurielIndicatifPresent();
	}
	
	public String conjuguer3emePersonnePluriel(Verbe v) {
		return v.conjugue3emePersonnePlurielIndicatifPresent();
	}

	public String getTemps(){
		return "Indicatif Présent";
	}
}
