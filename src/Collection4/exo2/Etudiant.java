package Collection4.exo2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Etudiant implements Iterable<Note>,Comparable<Etudiant>{
    public static int compteur = 0;
    private int numeroEtudiant;
    private String nom;
    private List<Note> notes;

    public Etudiant(String nom, List<Note> notes) {
	this.nom = nom;
	this.notes = notes;
	this.numeroEtudiant = compteur;
	compteur++;
    }

    public String getNom() {
	return nom;
    }

    @Override
    public String toString() {
	return "Etudiant [nom=" + nom + ", notes=" + notes + "]";
    }

    public int getNumeroEtudiant() {
	return numeroEtudiant;
    }

    public Iterator<Note> iteratorNotes() {
        return notes.iterator();
    }

    @Override
    public Iterator<Note> iterator() {
        return notes.iterator();
    }

    @Override
    public void forEach(Consumer<? super Note> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public int compareTo(Etudiant o) {
        if(this.getNom().equals(o.getNom())) {
            return this.getNumeroEtudiant() - o.getNumeroEtudiant();
        }
        return this.getNom().compareTo(o.getNom());
    }
}