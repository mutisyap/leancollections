package ke.natujenge.java.collections.learnlist;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // instantiate
        List<String> natujengeStudents = new ArrayList<>();

        // add students
        natujengeStudents.add("Mwita");
        natujengeStudents.add("Mercy");
        natujengeStudents.add("Brian");
        natujengeStudents.add("Peter");

        // traverse => applies to all collections

        // traverseWhileChangingIterator(natujengeStudents);

        natujengeStudents.removeIf(student -> student.equalsIgnoreCase("Peter"));

        traverse(natujengeStudents);
    }

    private static void traverseWhileChangingForIndex(List<String> natujengeStudents){
        for (int i =0; i< natujengeStudents.size(); i++){
            String student = natujengeStudents.get(i);

            if (student.equalsIgnoreCase("Peter")){
                natujengeStudents.remove(i);
            }
        }
    }

    private static void traverseWhileChangingForEach(List<String> natujengeStudents){
        for (String student : natujengeStudents){
            if (student.equalsIgnoreCase("Peter")){
                natujengeStudents.remove(student);
            }
        }
    }

    private static void traverseWhileChangingIterator(List<String> natujengeStudents){
        Iterator<String> iterator = natujengeStudents.iterator();
        while(iterator.hasNext()){
            String student = iterator.next();
            if (student.equalsIgnoreCase("Peter")){
                natujengeStudents.remove(student);
            }
        }
    }



    private static void traverse(List<String> natujengeStudents){
        // 1. for index
        for(int i = 0; i< natujengeStudents.size(); i++){
            String student = natujengeStudents.get(i);
            System.out.println("Student : "+ i +" = "+ student);
        }

        // 2. for each
        for (String student : natujengeStudents){
            System.out.println("FOR EACH: Student : "+ student);
        }

        // 3. Iterator
        for (String natujengeStudent : natujengeStudents) {
            System.out.println("ITERATOR: Student : " + natujengeStudent);
        }

        // 4. Stream =>
        natujengeStudents.stream().map(natujengeStudent -> "Stream: Student : " + natujengeStudent).forEach(System.out::println);
    }
}
