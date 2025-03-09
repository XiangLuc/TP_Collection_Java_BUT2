package Collection5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ResponderSynonyme implements Responder{
    private Map<String,String> responseMap;
    private Map<String,String> synonymes;
    private ArrayList<String> defaultResponse;

    public ResponderSynonyme() {
        this.responseMap = new HashMap<>();
        this.synonymes = new HashMap<>();
        this.defaultResponse = new ArrayList<>();
        fillResponseMap();
        fillDefaultReponses();
        fillSynonyme();
    }
    @Override
    public String generateResponse(Collection<String> c) {
        for(String s : c) {
            if(representantsSontDansResponseMap(s)) {
                return responseMap.get(synonymes.get(s));
            }

            if(responseMap.containsKey(s)) {
                return responseMap.get(s);
            }
        }
        return pickDefaultResponse();
    }

    public void fillResponseMap() {
        this.responseMap.put("plante","Eh bien, ca ne plante pas sur notre systeme. Cela doit etre lie a votre systeme. Dites-m'en plus au sujet de votre configuration.");
        //this.responseMap.put("planter","Eh bien, ca ne plante pas sur notre systeme. Cela doit etre lie a votre systeme. Dites-m'en plus au sujet de votre configuration.");
        this.responseMap.put("lent","Je pense que c'est lie a votre materiel. La mise a niveau de votre processeur devrait resoudre tous vos problemes de performances. Avez-vous un probleme avecnotre software?");
        this.responseMap.put("performance","Les performances etaient assez bonnes lors de nos tests. D'autres procedures s'executent-elles en arriere-plan ?");
        //this.responseMap.put("bogue","Vous savez, tous les logiciels ont des bogues. Mais nos ingenieurs logiciels travaillent pour les resoudre. Pouvez-vous decrire le probleme en details?");
        this.responseMap.put("bug","Vous savez, tous les logiciels ont des bogues. Mais nos ingenieurs logiciels travaillent pour les resoudre. Pouvez-vous decrire le probleme en details?");
        this.responseMap.put("windows","Ceci est un bogue connu lie au systeme d'exploitation Windows. Veuillez le signaler a Microsoft. Nous ne pouvons rien faire a cela.");
        this.responseMap.put("macintosh","Ceci est un bogue connu lie au systeme d'exploitation Mac. Veuillez le signaler a Apple. Nous ne pouvons rien faire a cela.");
    }

    public void fillSynonyme() {
        this.synonymes.put("planter","plante");
        this.synonymes.put("bogue","bug");
    }

    public void fillDefaultReponses() {
        defaultResponse.add("Cela semble etrange. Pourriez-vous decrire ce probleme plus precisement ?");
        defaultResponse.add("Aucun autre client ne s'est jamais plaint de cela. Quelle est votre configuration systeme ?");
        defaultResponse.add("Cela est interessant. Dites-m'en plus...");
        defaultResponse.add("J'ai besoin d'un peu plus d'informations a ce sujet");
        defaultResponse.add("Avez-vous verife que vous n'avez pas de conflit de dll ?");
        defaultResponse.add("Ceci est explique dans le manuel. Avez-vous lu le manuel ?");
        defaultResponse.add("Votre description est un peu confuse. Y a-t-il un expert pres de vous qui pourrait decrire ceci plus precisement ?");
        defaultResponse.add("Ce n'est pas un bogue, c'est une fonctionnalite !");
        defaultResponse.add("Pourriez-vous preciser ?");
    }

    public String pickDefaultResponse() {
        int n = (int) (Math.random()*defaultResponse.size())+1;
        return defaultResponse.get(n);
    }

    public boolean representantsSontDansResponseMap(String s) {
        return synonymes.containsKey(s);
    }
}
