package main.java.org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;
import org.example.VerbeGroupe1.VerbeGroupe1Classique;

public class Groupe1ER extends TrouverGroupe {
    public Groupe1ER(TrouverGroupe suivant) {
        super(suivant);
    }

    @Override
    protected Verbe SearchGroupe(String string) {
        try{
            return new VerbeGroupe1Classique(string);
        }
        catch (Exception e)
        {
            return null;
        }
    }

}
