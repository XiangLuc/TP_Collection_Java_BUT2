package Collection4.exo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Module m = new Module("M1R1",Niveau.M1);

        Note n1 = new Note(m,10);
        Note n2 = new Note(m,12);
        Note n3 = new Note(m,15);
        Note n4 = new Note(m,10);
        Note n5 = new Note(m,7);

        List<Note> noteList = new ArrayList<>();
        Collections.addAll(noteList,n1,n2,n3);

        List<Note> noteList2 = new ArrayList<>();
        Collections.addAll(noteList2,n4,n5);

        Etudiant e1 = new Etudiant("A",noteList);
        Etudiant e2 = new Etudiant("B",noteList2);
        Promo p = new Promo();
        p.ajouter(e1);
        p.ajouter(e2);

        System.out.println("Affichage moyenne : ");
        System.out.println(p.moyennePromo());

    }
}
