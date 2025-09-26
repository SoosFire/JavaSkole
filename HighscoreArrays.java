import java.util.Scanner;

public class HighscoreArrays {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        int sum = 0;
        double avarage = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int[] highscores = new int[10];
        System.out.println("Skriv dine 10 scores: ");
        for (int i = 0; i < highscores.length; i++){
            System.out.println("Highscore " + (i+1) + ": ");
            highscores[i] = input.nextInt();
            if (highscores[i] < min){
                min = highscores[i];
            }
            if (highscores[i] > max){
                max = highscores[i];
            }
            sum += highscores[i];
        }
        avarage = sum / highscores.length;

        java.util.Arrays.sort(highscores);
        for (int i = 0; i < highscores.length; i++){
            System.out.println("Highscore " + (i+1) + ": "+ highscores[i]);
        }
        System.out.println();
        System.out.println("Mindste værdien er: " + min);
        System.out.println("Maks værdien er: " + max);
        System.out.println("Gennemsnittet er: " + avarage);
    }
}
