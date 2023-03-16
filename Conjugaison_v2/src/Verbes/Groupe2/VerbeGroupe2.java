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
		return "is";
	}

	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulier() {
		return "is";
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
