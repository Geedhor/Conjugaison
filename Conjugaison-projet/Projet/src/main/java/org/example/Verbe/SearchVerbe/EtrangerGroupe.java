package org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;

public interface EtrangerGroupe {

    /**
     * @param infinitif : represente l'infinitif d'un verbe.
     *                 exemples: manger, tenir, nourrir, connaître, etc...
     * @return renvoie le verbe correspondant à l'infinitif, retour null si le verbe n'est pas reconnu
     * */
    public Verbe traduit(String infinitif);

}
