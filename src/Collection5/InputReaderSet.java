package Collection5;

import java.util.*;

public class InputReaderSet implements InputReader{

    @Override
    public Collection<String> getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un texte : ");
        String [] strTab = sc.nextLine().trim().split(" ");
        Set<String> strSet = new HashSet<>();
        strSet.addAll(Arrays.asList(strTab));
        return strSet;
    }
}
