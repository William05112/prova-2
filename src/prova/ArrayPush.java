package prova;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        int[] numbers = {6, 5, 8, 9, 10};
        int[] newNumbers = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
            
        }
        newNumbers[numbers.length] = 22;
        String stringa = Arrays.toString(newNumbers);
        System.out.println(stringa);
        

        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
        // for (int i = 0; i < newNumbers.length; i++) {
        //     System.out.println(newNumbers[i]);
        // }

        // System.out.println(numbers.length);

    }
    
}
