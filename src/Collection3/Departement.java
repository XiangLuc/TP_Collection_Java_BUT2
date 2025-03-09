package Collection3;

import java.util.*;
import java.util.function.Predicate;

public class Departement {

    private ArrayList<Enseignant> enseignants;
    private Set<Cours> lesCours;

    public Departement() {
		enseignants = new ArrayList<Enseignant>();
		lesCours = new HashSet<>();
    }
  
    public void ajouter(Enseignant e) throws Exception {
		boolean b = enseignants.add(e);
		if(!b) {
			throw new Exception("Cour existant");
		}
    }

    public Enseignant getEnseignant(int i) {
		return enseignants.get(i);
    }

    @Override
    public String toString() {
	return "Departement [enseignants=" + enseignants + "\n lesCours= \n"
		+ lesCours + "]";
    }

    public void ajouter(Cours c)  {
    	lesCours.add(c);
    }

	public Set<String> lesIntitulesDeCours() {
		Set<String> listeIntitule = new HashSet<>();
		for(Cours c : lesCours) {
			listeIntitule.add(c.getIntitule());
		}
		return listeIntitule;
	}

	public SortedSet<String> lesIntitulesDeCoursTrie() {
		SortedSet<String> coursTrie = new TreeSet<>((o1,o2) -> o1.compareTo(o2));
		for (Cours c : lesCours) {
			coursTrie.add(c.getIntitule());
		}
		return coursTrie;
	}

	public SortedSet<Cours> lesCoursParNiveauPuisNom() {
		Comparator<Cours> comparatorNivNom = (o1,o2) -> {
			if(o1.getNiveau().compareTo(o2.getNiveau()) == 0) {
				return o1.getIntitule().compareTo(o2.getIntitule());
			}
			return o1.getNiveau().compareTo(o2.getNiveau());
		};
		SortedSet<Cours> coursSortedSet = new TreeSet<>(comparatorNivNom);
		for(Cours c : lesCours) {
			coursSortedSet.add(c);
		}
		return coursSortedSet;
	}

	public SortedSet<String> NomsEnseignants() {
		SortedSet<String> stringSortedSet = new TreeSet<>((o1,o2) -> o1.compareTo(o2));
		for(Enseignant e : enseignants) {
			stringSortedSet.add(e.getNom());
		}
		return stringSortedSet;
	}

	public Set<Enseignant> lesResponsables() {
		Set<Enseignant> enseignantSet = new HashSet<>();
		for(Enseignant e : enseignants) {
			enseignantSet.add(e);
		}
		return enseignantSet;
	}

	public ArrayList<String> lesNomsCoursDeEnseignant(String nom) {
		ArrayList<String> intitule = new ArrayList<>();
		for(Cours c : lesCours) {
			if(c.getResponsable().getNom().equals(nom)) {
				intitule.add(c.getIntitule());
			}
		}
		return intitule;
	}

	public SortedSet<Enseignant> lesResponsablesL2NomPuisIdentifiant() {

		Comparator<Enseignant> nomPuiId = (o1,o2) -> {
			if(o1.getNom().compareTo(o2.getNom())==0) {
				return o1.getIdentifiant()-o2.getIdentifiant();
			}
			return o1.getNom().compareTo(o2.getNom());
		};

		SortedSet<Enseignant> ens = new TreeSet<>(nomPuiId);

		for(Cours c : lesCours) {
			if(c.getNiveau().equals(Niveau.L2)) {
				ens.add(c.getResponsable());
			}
		}

		return ens;
	}

	public int nbreResponsable() {
		Set<Enseignant> ens = new HashSet<>();
		for(Cours c : lesCours) {
			ens.add(c.getResponsable());
		}
		return ens.size();
	}

	public SortedSet<Enseignant> trieParNomPuisNombreDeResponsabilite() {



		return null;
	}

	private int calculerNombreResponsabilites(Enseignant enseignant) {

		return 0;
	}
}