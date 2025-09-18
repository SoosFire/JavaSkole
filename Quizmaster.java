import java.util.Scanner;

public class Quizmaster {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Quizmaster quizmaster = new Quizmaster();
        
        System.out.println("Velkommen til Quizmaster!");
        System.out.println("Hvor mange spørgsmål vil du besvare?");
        int antalSporgsmal = input.nextInt();
        input.nextLine(); // Ryd scanner buffer

        int score = 0;
        for (int i = 1; i <= antalSporgsmal; i++)
        {
            System.out.println("Spørgsmål " + i + ":");
            if (quizmaster.stilSporgsmal(input, i)) {
                score++;
                System.out.println("Korrekt!\n");
            } else {
                System.out.println("Forkert.\n");
            }
        
            }
            System.out.println("Du besvarede " + score + " ud af " + antalSporgsmal + " spørgsmål korrekt.");
            input.close();
        }
    
        // Tilføj stilSporgsmal-metoden udenfor main
        public boolean stilSporgsmal(Scanner input, int questionNumber) {
            // Eksempelspørgsmål og svar
            String [] question = {
            "Hvad er hovedstaden i Danmark?",
            "Hvad er 5 + 7?",
            "Hvad er farven på et slukket TV?",
            "Hvad er hovedstaden i Frankrig?",
            "Hvad er 12 * 12?"
            };

            String [] correctAnswer = {
            "København",
            "12",
            "Sort",
            "Paris",
            "144"
            };

            if (questionNumber < 1 || questionNumber > question.length) {
                System.out.println("Ugyldigt spørgsmål nummer.");
                return false;
            }



            System.out.println(question[questionNumber - 1]);
            String userAnswer = input.nextLine().trim();

            return userAnswer.equalsIgnoreCase(correctAnswer[questionNumber - 1]);
        }


    }
