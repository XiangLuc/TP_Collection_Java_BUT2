package Collection5;

import java.util.Set;

public class Lancement {
    public static void main(String[] args) {

        SupportSystem supportSystem = new SupportSystem(new InputReaderSet(),new ResponderSynonyme());

        supportSystem.start();
    }
}
