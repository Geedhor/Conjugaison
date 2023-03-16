package org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;
import org.example.VerbeGroupe1.VerbeGroupe1EnGer;

public class Groupe1GER extends TrouverGroupe {
    public Groupe1GER(TrouverGroupe groupe1ER) {
        super(groupe1ER);
    }

    @Override
    protected Verbe SearchGroupe(String string) {
        try {
            return new VerbeGroupe1EnGer(string);
        }
        catch(Exception e)
        {
            return null;
        }
    }


}
