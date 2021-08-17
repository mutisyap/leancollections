package ke.natujenge.java.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> natujengeStudents = new TreeMap<>();

        natujengeStudents.put("brian@natujenge", "Brian");
        natujengeStudents.put("mercy@natujenge", "Mercy");
        natujengeStudents.put("mwita@natujenge", "Mwita");

        // get one
        System.out.println("GET : brian@natujenge : "+ natujengeStudents.get("brian@natujenge"));

        // traverse
        // traverse(natujengeStudents);

        traverseUsingIterator(natujengeStudents);
    }

    private static void traverse(Map<String, String> natujengeStudents){
        Set<String> keySet = natujengeStudents.keySet();

        for (String key: keySet){
            System.out.println(key + " : "+ natujengeStudents.get(key));
        }
    }
    private static void traverseUsingIterator(Map<String, String> natujengeStudents){
        Set<String> keySet = natujengeStudents.keySet();

        Iterator<String> keyIterator = keySet.iterator();

        while(keyIterator.hasNext()){
            String key = keyIterator.next();

            System.out.println(key + " : "+ natujengeStudents.get(key));
        }

    }


}
