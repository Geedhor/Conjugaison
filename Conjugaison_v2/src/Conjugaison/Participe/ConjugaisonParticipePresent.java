package Conjugaison.Participe;

import Conjugaison.Conjugaison;
import Verbes.Verbe;

public class ConjugaisonParticipePresent extends Conjugaison {

	public String conjuger(Verbe v) {

		return v.conjugueParticipePresent();

	}
	
}
