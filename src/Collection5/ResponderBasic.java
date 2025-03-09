package Collection5;

import java.util.Collection;

public class ResponderBasic implements Responder{
    @Override
    public String generateResponse(Collection<String> c) {
        return "Vous savez, tous les logiciels ont des bogues. Pouvez-vous decrire le probleme en detail ?";
    }
}
