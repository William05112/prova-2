import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digita la prima parola");
        String prima = scanner.nextLine();

        System.out.println("digita la seconda parola");
        String seconda = scanner.nextLine();

        scanner.close();

        boolean primaMaggioreSeconda = prima.length() > seconda.length() ; 

        if (primaMaggioreSeconda) {
            System.out.println("la prima è più lunga ");
        } else if (prima.length()<seconda.length()){
            System.out.println("la seconda è più lunga");
        } else {
            System.out.println("le due parole sono uguali");
        }
    }
}
