package Expert;

import Verbes.Groupe3.VerbeGroupe3Aitre;
import Verbes.Verbe;

public class ExpertVerbe5Aitre extends ExpertEnsemble {

	public ExpertVerbe5Aitre(ExpertEnsemble e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe3Aitre(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
