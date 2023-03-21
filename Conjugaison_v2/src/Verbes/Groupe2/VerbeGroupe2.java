package Verbes.Groupe2;
import Verbes.Verbe;

public class VerbeGroupe2 extends Verbe{

	public VerbeGroupe2(String v) {
		super(v);
	}
	
	public String getFin() {
		return "ir";
	}

	public String avantTerminaison1erePersonneSingulier() {
		return "";
	}
	
	public String terminaison1erePersonneSingulier() {
		return avantTerminaison1erePersonneSingulier() + "is";
	}

	
	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulier() {
		return avantTerminaison2emePersonneSingulier() + "is";
	}
	
	
	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulier() {
		return avantTerminaison2emePersonneSingulier() + "it";
	}
	
	
	public String avantTerminaison1erePersonnePluriel() {
		return "iss";
	}
	
	
	public String avantTerminaisonParticipePresent() {
		return "iss";
	}
	
	
	public String terminaisonParticipePasse() {
		return "i";
	}
}
