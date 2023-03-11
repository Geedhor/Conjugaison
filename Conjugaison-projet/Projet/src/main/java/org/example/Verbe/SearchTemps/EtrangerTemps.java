package org.example.Verbe.SearchTemps;

import org.example.Verbe.Verbe;

public interface EtrangerTemps {

    /**
     * @param temps : represente le temps a conjuguer (present, futur ou passé composé.
     *
     * @return renvoie le verbe correspondant à l'infinitif, retour null si le verbe n'est pas reconnu
     * */
    public Verbe Temps(String temps);

}
