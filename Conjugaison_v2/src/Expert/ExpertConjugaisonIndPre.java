package Expert;

import Conjugaison.Conjugaison;
import Conjugaison.Indicatif.ConjugaisonIndicatifPresent;

public class ExpertConjugaisonIndPre extends ExpertEnsemble{
    public ExpertConjugaisonIndPre(ExpertEnsemble e){ super(e); }

    public Conjugaison resoudre2(String s) {
        try {
            return new ConjugaisonIndicatifPresent(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
