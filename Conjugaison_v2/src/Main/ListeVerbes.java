package Main;

import java.util.ArrayList;

import Conjugaison.Conjugaison;
import Expert.*;
import Verbes.Verbe;

public class ListeVerbes {
	
	String[] verbes = { "marcher","frémir","placer","ralentir","manger","aimer","rejoindre",
						"éteindre","paraitre","Théo","apparaitre","permettre"};
	
	public ArrayList<Verbe> conversion(String [] v) {
		ExpertVerbe e6 = new ExpertVerbe6Indre(null);
		ExpertVerbe e5 = new ExpertVerbe5Aitre(e6);
		ExpertVerbe e4 = new ExpertVerbe4Ir(e5);
		ExpertVerbe e3 = new ExpertVerbe3Er(e4);
		ExpertVerbe e2 = new ExpertVerbe2Ger(e3);
		ExpertVerbe e1 = new ExpertVerbe1Cer(e2);
		
		ArrayList<Verbe> verbe = new ArrayList<Verbe>();
		for(int i=0; i<v.length; i++) {
			Verbe vb = e1.resoudre(v[i]);
			if(vb == null) System.out.println("Le verbe '" + v[i ] + "' n'est pas géré");
			else verbe.add(vb);
		}
		return verbe;
	}
	
	public String conjugaison(Conjugaison c) {
		String res = "";
		for(Verbe v: conversion(verbes)) { res += c.conjuger(v) + "\n"; }
		return res;
	}
	
}
