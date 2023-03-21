package Expert;

import Main.Verbe;

public abstract class ExpertVerbe implements Expert{

	ExpertVerbe suivant;
	
	public ExpertVerbe(ExpertVerbe s){
		this.suivant = s;
	}
	
	public Verbe resoudre(String v) {
		Verbe vb = this.resoudre2(v);
		if(vb != null) {
			return vb;
		} else {
			if(this.suivant != null) {
				return this.suivant.resoudre(v);
			} else {
				return null;
			}
		}
	}
	
	public abstract Verbe resoudre2 (String s);
}
