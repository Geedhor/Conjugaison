package Verbes;

public abstract class Verbe {
	
	protected String radical;
	
	public Verbe(String v) {
		if(legalVerbe(v)) {
			this.radical = v.substring(0,v.length()-tailleFin());
		} else {
			throw new IllegalArgumentException("Verbe incorrect");
		}
	}

	//------------------------------------------------//

	public String conjugue1erePersonneSingulierIndicatifPresent() {
		return jOuJe() + this.radical + this.terminaison1erePersonneSingulierIndicatifPresent();
	}

	public String conjugue2emePersonneSingulierIndicatifPresent() {
		return "Tu " + this.radical + this.terminaison2emePersonneSingulierIndicatifPresent();
	}
	
	public String conjugue3emePersonneSingulierIndicatifPresent() {
		return "Il/Elle/On " + this.radical + this.terminaison3emePersonneSingulierIndicatifPresent();
	}
	
	public String conjugue1erePersonnePlurielIndicatifPresent() {
		return "Nous " + this.radical + this.terminaison1erePersonnePlurielIndicatifPresent();
	}

	//------------------------------------------------//

	public boolean estVoyelle(String c) {
		return "aeiouy".contains(c);
	}
	
	public String jOuJe() {
		if(estVoyelle(this.radical.substring(0,1))) {
			return "J'";
		} else {
			return "Je ";
		}
	}
	
	public boolean legalVerbe(String v) {
		return v.endsWith(getFin());
	}
	
	public abstract String getFin();
	
	public int tailleFin() {
		return getFin().length();
	}

	//------------------------------------------------//

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulier() + terminaison1erePersonneSingulierIndicatifPresent();
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulier() + terminaison2emePersonneSingulierIndicatifPresent();
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulier() + terminaison3emePersonneSingulierIndicatifPresent();
	}

	public String terminaison1erePersonnePlurielIndicatifPresent() {
		return avantTerminaison1erePersonnePluriel() + "ons";
	}

	//------------------------------------------------//

	public abstract String avantTerminaison1erePersonneSingulier();
	
	public abstract String avantTerminaison2emePersonneSingulier();
	
	public abstract String avantTerminaison3emePersonneSingulier();

	public abstract String avantTerminaison1erePersonnePluriel();

}
