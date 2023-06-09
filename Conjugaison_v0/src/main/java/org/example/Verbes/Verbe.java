package org.example.Verbes;

import org.example.Expert.Ensemble;

public abstract class Verbe extends Ensemble {
	
	protected String radical;
	
	public Verbe(String v) {
		if(legalVerbe(v)) {
			this.radical = v.substring(0,v.length()-tailleFin());
		} else {
			throw new IllegalArgumentException("Verbe incorrect");
		}
	}

	//------------------------------------------------//

	public boolean legalVerbe(String v) {
		return v.endsWith(getFin());
	}

	public abstract String getFin();

	public int tailleFin() {
		return getFin().length();
	}

	public String getRadical(){
		return this.radical;
	}


	/* ------ Indicatif Present ------ */

	public String conjugue1erePersonneSingulierIndicatifPresent() {
		return this.radical + this.terminaison1erePersonneSingulierIndicatifPresent();
	}

	public String conjugue2emePersonneSingulierIndicatifPresent() {
		return this.radical + this.terminaison2emePersonneSingulierIndicatifPresent();
	}
	
	public String conjugue3emePersonneSingulierIndicatifPresent() {
		return this.radical + this.terminaison3emePersonneSingulierIndicatifPresent();
	}
	
	public String conjugue1erePersonnePlurielIndicatifPresent() {
		return this.radical + this.terminaison1erePersonnePlurielIndicatifPresent();
	}
	
	public String conjugue2emePersonnePlurielIndicatifPresent() {
		return this.radical + this.terminaison2emePersonnePlurielIndicatifPresent();
	}
	
	public String conjugue3emePersonnePlurielIndicatifPresent() {
		return this.radical + this.terminaison3emePersonnePlurielIndiactifPresent();
	}

	//------------------------------------------------//

	public abstract String terminaison1erePersonneSingulierIndicatifPresent();

	public abstract String terminaison2emePersonneSingulierIndicatifPresent();

	public abstract String terminaison3emePersonneSingulierIndicatifPresent();

	public String terminaison1erePersonnePlurielIndicatifPresent() {
		return avantTerminaison1erePersonnePlurielIndicatifPresent() + "ons";
	}
	
	public String terminaison2emePersonnePlurielIndicatifPresent() {
		return avantTerminaison2_3emePersonnePlurielIndicatifPresent() + "ez";
	}

	public String terminaison3emePersonnePlurielIndiactifPresent() {
		return avantTerminaison2_3emePersonnePlurielIndicatifPresent() + "ent";
	}

	//------------------------------------------------//

	public abstract String avantTerminaisonSingulierIndicatifPresent();

	public abstract String avantTerminaison1erePersonnePlurielIndicatifPresent();
	
	public abstract String avantTerminaison2_3emePersonnePlurielIndicatifPresent();



	/* ------ Indicatif Futur ------ */

	public String conjugue1erePersonneSingulierIndicatifFutur() {
		return this.radical + this.terminaison1erePersonneSingulierIndicatifFutur();
	}

	public String conjugue2emePersonneSingulierIndicatifFutur() {
		return this.radical + this.terminaison2emePersonneSingulierIndicatifFutur();
	}

	public String conjugue3emePersonneSingulierIndicatifFutur() {
		return this.radical + this.terminaison3emePersonneSingulierIndicatifFutur();
	}

	public String conjugue1erePersonnePlurielIndicatifFutur() {
		return this.radical + this.terminaison1erePersonnePlurielIndicatifFutur();
	}

	public String conjugue2emePersonnePlurielIndicatifFutur() {
		return this.radical + this.terminaison2emePersonnePlurielIndicatifFutur();
	}

	public String conjugue3emePersonnePlurielIndicatifFutur() {
		return this.radical + this.terminaison3emePersonnePlurielIndiactifFutur();
	}

	//------------------------------------------------//

	public String terminaison1erePersonneSingulierIndicatifFutur() { return avantTerminaisonIndicatifFutur() + "ai"; }

	public String terminaison2emePersonneSingulierIndicatifFutur() {
		return avantTerminaisonIndicatifFutur() + "as";
	}

	public String terminaison3emePersonneSingulierIndicatifFutur() {
		return avantTerminaisonIndicatifFutur() + "a";
	}

	public String terminaison1erePersonnePlurielIndicatifFutur() {
		return avantTerminaisonIndicatifFutur() + "ons";
	}

	public String terminaison2emePersonnePlurielIndicatifFutur() {
		return avantTerminaisonIndicatifFutur() + "ez";
	}

	public String terminaison3emePersonnePlurielIndiactifFutur() {
		return avantTerminaisonIndicatifFutur() + "ont";
	}

	//------------------------------------------------//

	public abstract String avantTerminaisonIndicatifFutur();



	/* ------ Indicatif Passé Composé ------ */

	public String conjugueIndicatifPasseCompose() {
		return this.radical + terminaisonIndicatifPasseCompose();
	}

	public abstract String terminaisonIndicatifPasseCompose();

	//public abstract String avantTerminaisonIndicatifPasseCompose();
}
