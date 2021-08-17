package ke.natujenge.java.collections.learnset;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Set<String> studentsSet = new HashSet<>();
        // Set<String> studentsSet = new LinkedHashSet<>();
        Set<String> studentsSet = new TreeSet<>();

        studentsSet.add("Mwita");
        studentsSet.add("Mercy");
        studentsSet.add("Brian");
        studentsSet.add("Mwita");
        studentsSet.add("Mwita");



        System.out.println("Students who have sked questions : "+ studentsSet);
    }
}
