package Expert;

import Groupe1.VerbeGroupe1G;
import Main.Verbe;

public class ExpertVerbe2Ger extends ExpertVerbe{

	public ExpertVerbe2Ger(ExpertVerbe e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe1G(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
