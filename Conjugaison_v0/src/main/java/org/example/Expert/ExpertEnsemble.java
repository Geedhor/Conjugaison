package org.example.Expert;


public abstract class ExpertEnsemble implements Expert {

	ExpertEnsemble suivant;
	
	public ExpertEnsemble(ExpertEnsemble s){
		this.suivant = s;
	}
	
	public Ensemble resoudre(String v) {
		Ensemble e = this.resoudre2(v);
		if(e != null) {
			return e;
		} else {
			if(this.suivant != null) {
				return this.suivant.resoudre(v);
			} else {
				return null;
			}
		}
	}
	
	public abstract Ensemble resoudre2 (String s);
}
