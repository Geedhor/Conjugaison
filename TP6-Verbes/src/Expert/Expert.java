package Expert;

import Main.Verbe;

public interface Expert {
	/**
	 * @param infinitif : Infinitif d'un verbe (exemples: placer,manger,paraître,rougir,peindre,etc...)
	 * @return le verbe correspondant à l'infinitif
	 * Return null si le verbe n'est pas reconnu 
	 */
	public Verbe resoudre (String infinitif);
	
}
