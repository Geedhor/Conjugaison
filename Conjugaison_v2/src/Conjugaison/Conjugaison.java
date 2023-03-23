package Conjugaison;

import Verbes.Verbe;

public abstract class Conjugaison {

	public String conjuger(Verbe v){
		return
			jOuJe(v) + conjuguer1erePersonneSingulier(v) + '\n' +
			"Tu " + conjuguer2emePersonneSingulier(v) + '\n' +
			"Il/Elle/On " + conjuguer3emePersonneSingulier(v) + '\n' +
			"Nous " + conjuguer1erePersonnePluriel(v) + '\n' +
			"Vous " + conjuguer2emePersonnePluriel(v) + '\n' +
			"Ils/Elles " + conjuguer3emePersonnePluriel(v);
	}

	public boolean estVoyelle(String c) {
		return "aeiouy".contains(c);
	}

	public String jOuJe(Verbe v) {
		if(estVoyelle(v.getRadical().substring(0,1))) {
			return "J'";
		} else {
			return "Je ";
		}
	}

	public abstract String conjuguer1erePersonneSingulier(Verbe v);

	public abstract String conjuguer2emePersonneSingulier(Verbe v);

	public abstract String conjuguer3emePersonneSingulier(Verbe v);

	public abstract String conjuguer1erePersonnePluriel(Verbe v);
	
	public abstract String conjuguer2emePersonnePluriel(Verbe v);
	
	public abstract String conjuguer3emePersonnePluriel(Verbe v);
	
}
