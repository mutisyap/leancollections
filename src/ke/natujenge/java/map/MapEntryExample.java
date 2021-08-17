package ke.natujenge.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
    public static void main(String[] args) {
        Map<String, String> natujengeStudents = new HashMap<>();

        natujengeStudents.put("brian@natujenge", "Brian");
        natujengeStudents.put("mercy@natujenge", "Mercy");
        natujengeStudents.put("mwita@natujenge", "Mwita");

        traverseUsingEntry(natujengeStudents);
    }

    private static void traverseUsingEntry(Map<String, String> natujengeStudents){
        for (Map.Entry<String, String> entry : natujengeStudents.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
