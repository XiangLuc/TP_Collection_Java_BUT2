package Collection5;

public class SupportSystem {

    private InputReader reader;
    private Responder responder;

    public SupportSystem(InputReader reader, Responder responder) {
        this.reader = reader;
        this.responder = responder;
    }

    public SupportSystem(InputReader reader) {
        this.reader = reader;
    }

    public void start() {
        printWelcome();
        System.out.println(responder.generateResponse( reader.getInput()));
        printGoodbye();
    }

    private void printWelcome() {
        System.out.println("\t Bienvenue dans le systeme d’assistance technique DodgySoft.");
    }

    private void printGoodbye() {
        System.out.println("Merci pour votre visite. Bye...");
    }
}
