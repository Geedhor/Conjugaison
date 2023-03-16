package main.java.org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;
import org.example.VerbeGroupe2.VerbeGroupe2Classique;

public class Groupe2IR extends TrouverGroupe {
    public Groupe2IR(TrouverGroupe groupe1GER) {
        super(groupe1GER);
    }

    @Override
    protected Verbe SearchGroupe(String string) {
        try{
            return new VerbeGroupe2Classique(string);
        }
        catch (Exception e)
        {
            return null;
        }
    }

}
