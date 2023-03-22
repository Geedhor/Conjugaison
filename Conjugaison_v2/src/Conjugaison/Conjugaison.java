package Conjugaison;

import Verbes.Verbe;

public abstract class Conjugaison {

	public String conjuger(Verbe v){
		return
			conjuguer1erePersonneSingulier(v) + '\n' +
			conjuguer2emePersonneSingulier(v) + '\n' +
			conjuguer3emePersonneSingulier(v) + '\n' +
			conjuguer1erePersonnePluriel(v) + '\n'
		;
	}

	public abstract String conjuguer1erePersonneSingulier(Verbe v);

	public abstract String conjuguer2emePersonneSingulier(Verbe v);

	public abstract String conjuguer3emePersonneSingulier(Verbe v);

	public abstract String conjuguer1erePersonnePluriel(Verbe v);
	
}
