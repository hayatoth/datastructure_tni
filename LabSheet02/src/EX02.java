package lab02;

import java.util.ArrayList;
import java.util.Arrays;

public class EX02 {

    public static void main(String[] args) {

        int lastDigit = 7;

        Integer[] initial_numbers = {
                10,11,12,13,14,15,16,17,18,19
        };

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(initial_numbers));

        
        System.out.println("Original : " + numbers);

       
        numbers.add(lastDigit);
        System.out.println("Add value : " + numbers);

        numbers.add(0,lastDigit);
        System.out.println("Add at index 0 : " + numbers);

       
        numbers.remove(numbers.size()-1);
        System.out.println("Delete last : " + numbers);

        numbers.set(numbers.size()-1,lastDigit);
        System.out.println("Update last : " + numbers);

    }

}