package Collection1;

import java.util.Objects;

public class Adresse {
    private int numeroRue;
    private String rue, ville, pays;

    public Adresse(int numeroRue, String rue, String ville, String pays) {
        super();
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
    }

    // @Override
    @Override
    public String toString() {
	return numeroRue + " " + rue + " , " + ville + " , " + pays + "\n";
    }

    public int getNumeroRue() {
	return numeroRue;
    }

    public String getRue() {
	return rue;
    }

    public String getVille() {
	return ville;
    }

    public String getPays() {
	return pays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return Objects.equals(pays, adresse.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pays);
    }
}
