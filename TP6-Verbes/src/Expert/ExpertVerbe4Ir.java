package Expert;

import Groupe2.VerbeGroupe2;
import Main.Verbe;

public class ExpertVerbe4Ir extends ExpertVerbe{

	public ExpertVerbe4Ir(ExpertVerbe e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe2(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
