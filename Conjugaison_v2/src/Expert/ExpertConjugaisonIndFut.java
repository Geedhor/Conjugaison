package Expert;

import Conjugaison.Conjugaison;
import Conjugaison.Indicatif.ConjugaisonIndicatifFutur;


public class ExpertConjugaisonIndFut extends ExpertEnsemble {

    public ExpertConjugaisonIndFut(ExpertEnsemble e){ super(e); }

    public Conjugaison resoudre2(String s) {
        try {
            return new ConjugaisonIndicatifFutur(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
