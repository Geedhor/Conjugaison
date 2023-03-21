package Expert;

import Groupe3.VerbeGroupe3Indre;
import Main.Verbe;

public class ExpertVerbe6Indre extends ExpertVerbe{

	public ExpertVerbe6Indre(ExpertVerbe e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe3Indre(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
