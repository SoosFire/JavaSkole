import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Opret Scanner objekt
        Scanner input = new Scanner(System.in);
        // Uskriver Navn
        System.out.println("Jonas Hansen");
        // Bed brugeren om at indtaste sit navn
        String name = input.nextLine();
        // Udskriv navnet
        System.out.println("Dit navn er: " + name);
        String nameLast = input.nextLine();
        System.out.println("Dit efternavn er: " + nameLast);
        System.out.println("Dit fulde navn er: " + name + " " + nameLast);
    }
} 