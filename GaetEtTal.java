import java.util.Random;
import java.util.Scanner;

public class GaetEtTal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ------------------------------------------------------------------------------------- //
        // Start skærmen // 
        System.out.println();
        System.out.println("    ┏━━━━━༻❁༺━━━━━┓");
        System.out.println("       GÆT ET TAL   ");
        System.out.println("    ┗━━━━━༻❁༺━━━━━┛");
        System.out.println();
        System.out.println("Vælg venligst din sværhedsgrad");
        System.out.println();
        System.out.println("Sværhedsgrader:");
        System.out.println("1)  Nem");
        System.out.println("2)  Mellem");
        System.out.println("3)  Svær");
        System.out.println();

        // ------------------------------------------------------------------------------------- //
        // Input til start spil og metoder //

        System.out.print("➤ ");
        String difficultyChosen = input.nextLine();
        
        int difficultyToPlay = difficultySet(difficultyChosen);

        int max = difficultyToPlay;
        int min = 1;
        
        // ------------------------------------------------------------------------------------- //
        // Start spil //
        boolean playAgain;

        do {
            playGame(input, max, min);
            System.out.print("\nVil du spille igen? (ja/nej) ➤ ");
            String wantToPlayAgain = input.nextLine().trim().toLowerCase();
            playAgain = playAgainMethod(input, wantToPlayAgain);
        } while (playAgain);


    }

    // ------------------------------------------------------------------------------------- //
    // Sværhedsgraden som bliver brugt i spilmetoden + sæt max-værdien til sværhedsgraden //
    public static int difficultySet (String difficultyChosen){
        int difficultyToPlay;

        switch (difficultyChosen){
            case "nem": 
                difficultyToPlay = 5;
                break;
            
            case "mellem":
                difficultyToPlay = 10;
                break;

            case "svær":
                difficultyToPlay = 15;
                break;

            default:
                System.out.println("Input ikke registreret, du får et nemt niveau");
                difficultyToPlay = 5;
                break;
        }

        return difficultyToPlay;

    }

    // ------------------------------------------------------------------------------------- //
    // Spil igen metoden. Returnerer boolean værdi //
    public static boolean playAgainMethod(Scanner input, String wantToPlayAgain){
 
        switch (wantToPlayAgain){
        case "ja":
            return true;
        case "nej":
            System.out.println("Tak fordi du spillede med!");
            return false;
        default:
            System.out.println("Input ikke registreret, du får et nemt niveau");
            return false;
        }
    }

    // ------------------------------------------------------------------------------------- //
    // Generere et tilfældigt tal baseret på brugerens valg af sværhedsgrad //
    public static int correctGameAnswer(int max, int min){
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }

    // ------------------------------------------------------------------------------------- //
    // Checker om brugerens input er det samme, som det generede tal // 
    public static boolean checkGuess(int userGuess, int correctNumber, int attempts){
        if (userGuess == correctNumber){
            System.out.println();
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.println("★ Tillykke! Det var rigtigt ★");
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.println();
            System.out.println("Det tog " + attempts + " forsøg");
            System.out.println();
            return true;
            } else if (userGuess < correctNumber){
                System.out.println("------------------------------------------");
                System.out.println("| Dit gæt er lavere end det korrekte tal |"); 
                System.out.println("------------------------------------------");
                System.out.println(); 
                return false;
            } else {
                System.out.println("------------------------------------------");
                System.out.println("| Dit gæt er højere end det korrekte tal |"); 
                System.out.println("------------------------------------------");
                System.out.println(); 
            }
            return false;
    }

    // ------------------------------------------------------------------------------------- //
    // Spil funktionen //
    public static void playGame (Scanner input, int max, int min){

        int correctNumber = correctGameAnswer(max, min);
        int attempts = 0;
        System.out.println("Tallet er mellem 1 og " + max);

        while (true){
            System.out.print("Skriv dit tal her ➤ ");

            while (!input.hasNextInt()){
                System.out.println("Skriv venligst et helt tal");
                input.next();
            }
        
            int userGuess = input.nextInt();
            input.nextLine();

            attempts++;

            if (checkGuess(userGuess, correctNumber, attempts)){
                break;
            }
        }
    }
}