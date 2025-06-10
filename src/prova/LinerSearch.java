package prova;

import java.util.Random;
import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);


        int[] interi = new int[15];

        for ( int i = 0; i < interi.length; i++){
            interi[i] = generator.nextInt(35);
            System.out.println(interi[i]);
        }
        System.out.println("scrivi un numero");
        int numeroDaCercare = scanner.nextInt();

        int index = 0;
         Boolean trovato = false;
         while (trovato == false && index < interi.length) {

            if (interi[index] == numeroDaCercare) {

                trovato = true;
            
                
            }

            System.out.println(interi[index]);

            index++;

            
         }

    //     for (int i = 0; i < interi.length; i++) {
    //         if (interi[i] == numeroDaCercare) {
    //             trovato = true;
    //             break;
    //         } 
    //     }
       

    if (trovato == false) {
        System.out.println("Non lo hai trovato");
        
    }else {
        System.out.println("Trovato");
    }

        scanner.close();

      
    }
    
}
