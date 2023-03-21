package Groupe1;
import Main.Verbe;

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
		return "é";
	}

	public String getFin() {
		return "er";
	}
}
