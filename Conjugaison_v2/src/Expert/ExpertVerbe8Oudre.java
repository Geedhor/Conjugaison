package Expert;

import Verbes.Groupe3.VerbeGroupe3Oudre;
import Verbes.Verbe;

public class ExpertVerbe8Oudre extends ExpertEnsemble {

    public ExpertVerbe8Oudre(ExpertEnsemble e) {
        super(e);
    }

    public Verbe resoudre2(String s) {
        try {
            return new VerbeGroupe3Oudre(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
