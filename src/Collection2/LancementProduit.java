package Collection2;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class LancementProduit {

    public static void main(String[] args) {
        Produit p112et30 = new Produit(112, 30);
        Produit p150et15 = new Produit(150, 15);
        Produit p120et30 = new Produit(120, 30);
        Produit p112et40 = new Produit(112, 40);
        Produit p120et30Bis = new Produit(120, 30);

        ComparateurParRefPuisPrix comparateur = new ComparateurParRefPuisPrix();

        System.out.println(comparateur.compare(p120et30, p112et40));

        SortedSet<Produit> sortedSet = new TreeSet<>(comparateur);

        Collections.addAll(sortedSet,p112et30,p150et15,p120et30,p112et40,p120et30Bis);

        System.out.println(sortedSet);

        Comparator<Produit> comparateurLambda = (p, q) -> {
            if (p.getReference() == q.getReference()) {
                return p.getPrix() - q.getPrix();
            } else {
                return p.getReference() - q.getReference();
            }
        };

        SortedSet<Produit> sortedSet2 = new TreeSet<>(comparateurLambda);

        Collections.addAll(sortedSet2,p112et30,p150et15,p120et30,p112et40,p120et30Bis);

        System.out.println(sortedSet2);

        Gens g1 = new Gens("lulu",18);
        Gens g2 = new Gens("toto",17);
        Gens g3 = new Gens("lulu",20);
        Gens g4 = new Gens("bibi",25);

        ComparateurParNomPuisAge comparateurParNomPuisAge = new ComparateurParNomPuisAge();
        SortedSet<Gens> comparateurGens = new TreeSet<>(comparateurParNomPuisAge);

        Collections.addAll(comparateurGens,g1,g2,g3,g4);

        System.out.println(comparateurGens);
    }
}