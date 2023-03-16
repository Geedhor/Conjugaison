package Verbes.Groupe1;
import Verbes.Verbe;

public class VerbeGroupe1 extends Verbe{

	public VerbeGroupe1(String v) {
		super(v);
	}
	
	public String terminaison1erePersonneSingulier() {
		return "e";
	}
	
	public String avantTerminaison1erePersonnePluriel() {
		return "";	
	}
	
	public String avantTerminaisonParticipePresent() {
		return "";
	}
	
	public String terminaisonParticipePasse() {
		return "�";
	}

	public String getFin() {
		return "er";
	}
}
