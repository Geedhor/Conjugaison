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
		return "";
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

	//------------------------------------------------//

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulierIndicatifPresent() + terminaison1erePersonneSingulierIndicatifPresent();
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulierIndicatifPresent() + terminaison2emePersonneSingulierIndicatifPresent();
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulierIndicatifPresent() + terminaison3emePersonneSingulierIndicatifPresent();
	}

	public String terminaison1erePersonnePlurielIndicatifPresent() {
		return avantTerminaison1erePersonnePlurielIndicatifPresent() + "ons";
	}
	
	public String terminaison2emePersonnePlurielIndicatifPresent() {
		return avantTerminaison2emePersonnePlurielIndicatifPresent() + "ez";
	}

	//------------------------------------------------//

	public abstract String avantTerminaison1erePersonneSingulierIndicatifPresent();
	
	public abstract String avantTerminaison2emePersonneSingulierIndicatifPresent();
	
	public abstract String avantTerminaison3emePersonneSingulierIndicatifPresent();

	public abstract String avantTerminaison1erePersonnePlurielIndicatifPresent();
	
	public abstract String avantTerminaison2emePersonnePlurielIndicatifPresent();

}
