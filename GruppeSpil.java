
import java.util.Scanner;

public class GruppeSpil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maxPoint = 100;
        
        System.out.println("Hej, hvad er dit navn");
        String name = input.nextLine();
        System.out.println("Hej " + name + ", velkommen til spillet!");
        System.out.println("Hvor mange point har du?");
        int point = input.nextInt();
        int missingPoints = maxPoint - point;
        System.out.println("Du mangler kun " + (missingPoints) + " point for at vinde!");
    }
}