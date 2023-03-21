package Expert;

import Main.Verbe;

public interface Expert {
	/**
	 * @param infinitif : Infinitif d'un verbe (exemples: placer,manger,para�tre,rougir,peindre,etc...)
	 * @return le verbe correspondant � l'infinitif
	 * Return null si le verbe n'est pas reconnu 
	 */
	public Verbe resoudre (String infinitif);
	
}
