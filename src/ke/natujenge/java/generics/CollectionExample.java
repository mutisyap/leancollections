package ke.natujenge.java.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        square(numbers);
    }

    public static void square(List<Integer> numbers){
        for(Integer number: numbers){
            System.out.println(number +" squared = "+ (number * number));
        }
    }
}
