package Expert;

import Groupe1.VerbeGroupe1;
import Main.Verbe;

public class ExpertVerbe3Er extends ExpertVerbe{

	public ExpertVerbe3Er(ExpertVerbe e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe1(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
