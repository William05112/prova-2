package prova;

import java.util.Scanner;

public class GiornoSettimana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per un giorno della settimana");
        String giorno = scanner.nextLine();
        scanner.close();

        String nomeGiorno;

        switch (giorno) {
            case "1":
                nomeGiorno = "Lunedi";
                break;
            case "2":
                nomeGiorno = "Martedì";
                break;
            case "3":
                nomeGiorno = "Mercoledì";
                break;
            case "4":
                nomeGiorno = "Giovedì";
                break;
            case "5":
                nomeGiorno = "Venerdì";
                break;
            case "6":
                nomeGiorno = "Sababato";
                break;
            case "7":
                nomeGiorno = "Domenica";
                break;

            default:
                nomeGiorno = "Errore di inserimento";
        }
         System.out.println(nomeGiorno);
    }

}
