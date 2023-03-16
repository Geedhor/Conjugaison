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

	public String conjugue1erePersonneSingulier() {
		return jOuJe() + this.radical + this.terminaison1erePersonneSingulier();
	}

	public String conjugue2emePersonneSingulier() {
		return "Tu " + this.radical + this.terminaison2emePersonneSingulier();
	}
	
	public String conjugue1erePersonnePluriel() {
		return "Nous " + this.radical + this.terminaison1erePersonnePluriel();
	}
	
	public String conjugueParticipePresent() {
		return "En " + this.radical + this.terminaisonParticipePresent();
	}
	
	public String conjugueParticipePasse() {
		return this.radical + this.terminaisonParticipePasse();
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
	
	public String terminaison1erePersonneSingulier() {
		return avantTerminaison1erePersonneSingulier() + terminaison1erePersonneSingulier();
	}

	public String terminaison2emePersonneSingulier() {
		return avantTerminaison2emePersonneSingulier() + terminaison2emePersonneSingulier();
	}
	
	public String terminaison1erePersonnePluriel() {
		return avantTerminaison1erePersonnePluriel() + "ons";
	}

	public String terminaisonParticipePresent() {
		return avantTerminaisonParticipePresent() + "ant";
	}

	public abstract String terminaisonParticipePasse();

	//------------------------------------------------//
	public abstract String avantTerminaison2emePersonneSingulier();

	public abstract String avantTerminaison1erePersonneSingulier();

	public abstract String avantTerminaison1erePersonnePluriel();
	
	public abstract String avantTerminaisonParticipePresent();

}
