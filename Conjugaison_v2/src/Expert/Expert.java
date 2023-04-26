package Expert;

import Verbes.Verbe;

public interface Expert {
	/**
	 * @param infinitif : Infinitif d'un verbe (exemples: placer,manger,para�tre,rougir,peindre,etc...)
	 * @return le verbe correspondant � l'infinitif
	 * Return null si le verbe n'est pas reconnu 
	 */
	public Ensemble resoudre (String infinitif);
	
}
