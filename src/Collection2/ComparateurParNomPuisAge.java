package Collection2;

import java.util.Comparator;

public class ComparateurParNomPuisAge implements Comparator<Gens> {

    @Override
    public int compare(Gens o1, Gens o2) {
        if(o1.getNom().compareTo(o2.getNom()) == 0) {
            if(o1.getAge() > o2.getAge()) {
                return o1.getAge();
            }
            return  o2.getAge();
        }
        return o1.getNom().compareTo(o2.getNom());
    }
}
