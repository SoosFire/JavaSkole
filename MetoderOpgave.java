import java.util.Scanner;

public class MetoderOpgave {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int max = 10;
        int min = 0;
        int rounds = 0;

        System.out.println("Vælg regneart (+, -, *, /)");
        String inputSymbol = input.nextLine();

        switch (inputSymbol){
            case "+":
                boolean play = true;
                while(play){
                
                rounds = rounds + 1;
                System.out.println(rounds);
                
                int number1 = (int) (Math.random() * (max-min +1) + min);
                int number2 = (int) (Math.random() * (max-min +1) + min);
                int correctAnswer = Add(number1, number2);
                
                System.out.println("Hvad er: " + number1 + " + " + number2 + "?");
                int guessNumber = input.nextInt();
                
                if (guessNumber == correctAnswer){
                    System.out.println("Tillykke. Det var rigtigt");
                } else {
                    System.out.println("Det var desværre forkert");
                }
                
                System.out.println("Vil du spille igen?");
                input.nextLine();
                String playAgain = input.nextLine().toLowerCase();
                if (playAgain.equals("ja")){
                    play = true;
                } else {
                    play = false;
                    System.out.println("Spillet slutter her!");
                }
                }   
            break;
        }
    }

    public static int Add(int number1, int number2){
        int correctAnswer = number1 + number2;
        return correctAnswer;
    }
}