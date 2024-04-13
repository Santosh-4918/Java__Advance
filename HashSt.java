import java.util.HashSet;
import java.util.*;

public class HashSt {
    public static void main(String[] args) {
        // Create HashSet to store String
        HashSet<String> hs = new HashSet<>();

        hs.add("Santosh");
        hs.add("Kumar");
        hs.add("Arti");

        // View the HashSet
        System.out.println("Hast Set =" + hs);

        // Add an Iterator to hs
        Iterator<String> it = hs.iterator();

        // display using iterator
        System.out.println("Elemet using Iterator: ");
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

    }
}
