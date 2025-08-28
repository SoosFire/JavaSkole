import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uskriver Navn
        try ( // Opret Scanner objekt
                Scanner input = new Scanner(System.in)) {
            // Uskriver Navn
            System.out.println("Skriv venligst dit fornavn");
            // Bed brugeren om at indtaste sit navn
            String name = input.nextLine();
            // Udskriv navnet
            System.out.println("Dit fornavn er: " + name);
            System.out.println("Skriv venligst dit efternavn");
            String nameLast = input.nextLine();
            System.out.println("Dit efternavn er: " + nameLast);
            System.out.println("Dit fulde navn er: " + name + " " + nameLast);
        }
    }
} 