package Main;

import Conjugaison.*;

public class TestVerbe {
	public static void main(String[] args) {
		ListeVerbes lv = new ListeVerbes();
		Conjugaison c = new Conjugaison1erePersonnePluriel();
		System.out.println(lv.conjugaison(c));
	}
}
