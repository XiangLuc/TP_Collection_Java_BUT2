package Collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExerciceEgaliteEtSET {

    public static void main(String[] args) {

        // ******************************************************
        // enlever les commentaires pour section 1 , exercice 1
        // *****************************************************

        Adresse a1, a2, a3, a4, a5;
        a1 = new Adresse(34, "bd Magenta", "Paris", "France");
        a2 = new Adresse(34, "bd Magenta", "Cahors", "France");
        a3 = new Adresse(12, "rue boule", "Marseille", "France");
        a4 = new Adresse(34, "bd Magenta", "Paris", "USA");
        a5 = new Adresse(34, "bd Magenta", "Paris", "France");

        System.out.println(" a1 est il egal a a2 ? :" + a1.equals(a2));
        System.out.println(" a1 est il egal a a3 ? :" + a1.equals(a3));
        System.out.println(" a1 est il egal a a4 ? :" + a1.equals(a4));
        System.out.println(" a1 est il egal a a5 ? :" + a1.equals(a5));
        System.out.println(" a1 est il egal a a1 ? :" + a1.equals(a1));

        // 1. : uniquement la dernière est true en JAVA !
        // 2. : non, on compare uniquement l'adresse d'objet et non le contenu
        // 3. : on aimerait considérer true : a1 et a5
        // 4. soit faire une fonction qui dit que si le contenant est égal à celle de obj2 alors ça retourne true ou bien recodée notre méthode equals

        // *****************************************************************
        // enlever les commentaires pour section 1 , exercice 2 question 3
        // *****************************************************************

        Personne p1 = new Personne("Dupont", "antoine", a1);
        Personne p2 = new Personne("Durand", "marie", a2);
        Personne p3 = new Personne("Dupond", "leo", a1);
        Personne p4 = new Personne("Dupont", "antoine", a1);

        System.out.println("P1 et P2 : " + p1.equals(p2));
        System.out.println("P1 et P3 : " + p1.equals(p3));
        System.out.println("P1 et P4 : " + p1.equals(p4));
        System.out.println("P2 et P3 : " + p2.equals(p3));
        System.out.println("P2 et P4 : " + p2.equals(p4));
        System.out.println("P3 et P4 : " + p3.equals(p4));


        // *****************************************************************
        // enlever les commentaires pour Section 2 (Set) exercice 1, 2 et 3)
        // *****************************************************************

        ArrayList<Adresse> la = new ArrayList<>();
        la.add(a1);
        la.add(a2);
        la.add(a3);
        la.add(a4);
        System.out.println("contains : " + la.contains(a5));

        //car en enlevant notre equals ça considère désormais que a1 et a2 n'ont juste pas la meme adresse et donc renvoie false

        System.out.println("set 1**********************");
        Set<Adresse> carnet = new HashSet<>();
        System.out.println(carnet.add(a1));
        System.out.println(carnet.add(a2));
        System.out.println(carnet.add(a3));
        System.out.println(carnet.add(a4));
        System.out.println(carnet.add(a5));
        System.out.println(carnet.add(a1));

        System.out.println(carnet);

        Set<Personne> carnet2 = new HashSet<>();
        System.out.println("egal p1 p2" + p1.equals(p2));
        System.out.println(carnet2.add(p1));
        System.out.println(carnet2.add(p2));
        System.out.println(carnet2.add(p3));
        System.out.println(carnet2.add(p4));

        System.out.println(carnet2);

		//que 4 éléments dans carnet
		//pour carnet on a que 4 éléments car on a pas rajouter le doublon a1 et a5
		//en enlevant le hashcode on consièdre plus a5 comme un doublon car la définiton de equals considère que c'est false
		//car on a plus le meme hashcode


    }
}
