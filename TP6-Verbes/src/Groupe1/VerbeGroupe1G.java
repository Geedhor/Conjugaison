package Groupe1;
public class VerbeGroupe1G extends VerbeGroupe1{

	public VerbeGroupe1G(String v) {
		super(v);
	}
	
	public String avantTerminaison1erePersonneSingulier() {
		return "g";
	}
	
	public String avantTerminaison1erePersonnePluriel() {
		return "ge";	
	}
	
	public String avantTerminaisonParticipePresent() {
		return "ge";
	}
	
	public String terminaisonParticipePasse() {
		return "g";
	}
	
	public String getFin() {
		return "ger";
	}
}
