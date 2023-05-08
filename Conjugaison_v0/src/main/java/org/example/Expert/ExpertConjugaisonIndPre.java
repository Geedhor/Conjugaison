package org.example.Expert;

import org.example.Conjugaison.Conjugaison;
import org.example.Conjugaison.Indicatif.ConjugaisonIndicatifPresent;

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
