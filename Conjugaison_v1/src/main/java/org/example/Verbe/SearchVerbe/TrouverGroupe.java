package main.java.org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;

public abstract class TrouverGroupe implements EtrangerGroupe{

    protected TrouverGroupe suivant;

    public TrouverGroupe(TrouverGroupe suivant){
        this.suivant = suivant;
    }

    public Verbe traduit(String string)
    {
        Verbe résultat;

        résultat = SearchGroupe(string);
        if (résultat != null){
            return résultat;
        }

        else

            if (this.suivant != null)
                return this.suivant.traduit(string);
            else
                return null;

    }

    protected abstract Verbe SearchGroupe(String string);


}