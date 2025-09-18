import java.util.Scanner;

public class Metoder {
    


        /* 
        Metoder kalder en funktion, hver gang den bliver brugt
        Det er en 'opskrift' for en funktion

        Begreber:

        void = Metoden returnere ikke noget;
        return = Sender en værdi tilbage fra metoden;
        parameter = Input.variabler man skriver i metodens parenteser;
        argumenter = De værdier man sender med, når man kalder metoden;

        Metoder skal laves udenfor main-class;

        -------------------------------------------------------------
        Metode uden paramter:
        
        public static void printMessage (){
            System.out.println("Hello world");
        }

        -------------------------------------------------------------
        Metode med parameter;
        public static void printMessage (String message){
            System.out.println(message);
        }

        Overloading:
        -------------------------------------------------------------
        Metode med return:
        public static int add (int a, int b){
            int sum = a + b;
            return sum;
        }
        -------------------------------------------------------------  
        Metode med parameter og return:
        public static int add (int a, int b){
            int sum = a + b;
            return sum;
        }
        -------------------------------------------------------------
        Metode med flere parametre og return:
        public static int add (int a, int b, int c){
            int sum = a + b + c;
            return sum;
        }
        ------------------------------------------------------------- 
        Metode med flere parametre og return:
        public static int add (int a, int b, int c, int d){
            int sum = a + b + c + d;
            return sum;
        }
        -------------------------------------------------------------   
        Rekursion:
        public static int factorial (int n){
            if (n == 0){
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
        -------------------------------------------------------------
        */


public static void main(String [] args){

    Scanner input = new Scanner (System.in);


    int base = input.nextInt();
    int multiplier = input.nextInt();
    int attacks = input.nextInt();
    int dmgtotal = dmg(base,multiplier,attacks);

    for (int i = 0; i < attacks; i++){
        System.out.println(dmgtotal * (i+1) + " # attack " + i);
    }


    }

    public static int dmg(int base, int multiplier, int attacks){
        int dmgtotal = base * multiplier * attacks;
        return dmgtotal;
    }

}