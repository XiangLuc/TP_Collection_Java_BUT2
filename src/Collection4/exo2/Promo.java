package Collection4.exo2;

import java.util.*;
import java.util.function.Consumer;

public class Promo {

    private SortedSet<Etudiant> etudiants;

    public Promo() {
		this.etudiants = new TreeSet<>();
    }

    public void ajouter(Etudiant e) {
	etudiants.add(e);
    }

    public double moyennePromo() {
		double moyenne = 0;
		for(Etudiant e : etudiants) {
			moyenne += moyenneEtudiant(e);
		}
		return moyenne/etudiants.size();
    }

	public double moyenneEtudiant(Etudiant e) {
		double noteCumule = 0;
		int compteur = 0;

        for (Note n : e) {
			noteCumule += n.getVal();
			compteur++;
        }

		return noteCumule/compteur;
	}
}