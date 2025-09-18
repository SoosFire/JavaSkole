import java.util.Scanner;

public class KapitelFem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //Opg1(input);
        //Opg2(input);
        //Opg3(input);
        //Opg5(input);
        //Opg6(input);
        //Opg7(input);
        //Opg8(input);
        //Opg9(input);
        //Opg10(input);
        //Opg11(input);
        //Opg12(input);
        Opg13(input);
    }



        public static void Opg1(Scanner input){

            System.out.println("Skriv dit navn:");
            String name = input.nextLine();

            for (int i = 0; i < 20; i++){
                System.out.println(name);
            }
        }

        public static void Opg2 (Scanner input) {
            
            System.out.println("Skriv dit navn");
            String name = input.nextLine();
            System.out.println("Skriv din alder");
            int age = input.nextInt();

            for (int i = 0; i < 16; i++){
                System.out.println(name);
                System.out.println(age);
            }
        }

        public static void Opg3 (Scanner input){
            
            int number = input.nextInt();
            int numberTotal;

            for (int i = 1; i <= 10; i++){
                numberTotal = i*number;
                System.out.print(numberTotal + " ");
            }
            System.out.println(" ");

        }

        public static void Opg5 (Scanner input){
            
            int number;
            int max = Integer.MIN_VALUE;

            for (int i = 1; i <= 10; i++){
                number = input.nextInt();
                if (number > max){
                    max = number;
                }
                System.out.println(max);
            }
        }

        public static void Opg6 (Scanner input){

            int number;
            int min = Integer.MAX_VALUE;

            for (int i = 1; i <= 10; i++){
                number = input.nextInt();
                if (number < min){
                    min = number;
                }
                System.out.println("Det mindste tal er: " + min);
            }
        }

        public static void Opg7(Scanner input){
            int number;
            int sum = 0;
            
            for (int i = 1; i <=5; i++){
                number = input.nextInt();
                sum += number;
            }
            System.out.println("Summen er: " + sum);
        }

        public static void Opg8(Scanner input){

            int number;
            int sum = 0;
            int snit = 0;

            for (int i = 1; i <= 5; i++){
                number = input.nextInt();
                sum += number;
                snit = sum/i;
            }
            System.out.println("Summen er: " + sum);
            System.out.println("Snittet er: " + snit);
        }

        public static void Opg9 (Scanner input){

            int number;
            int value = 0;
            int sum = 0;

            while (value != 1){
                number = input.nextInt();
                sum += number;
                if (number == 0){
                    value = 1;
                }
            }
            System.out.println(sum);
        }

        public static void Opg10(Scanner input){
            
            int number = 1;
            int sum = 0;

            while (number != 0){
                number = input.nextInt();
                if (number > 5){
                    sum += number;
                }
            }
            System.out.println("Summen er: " + sum);
        }

        public static void Opg11(Scanner input){

            int number = 1;
            int sum = 0;

            while (number != 0){
                number = input.nextInt();
                if (number % 2 == 0){
                    sum += number;
                }
            }
            System.out.println(sum);
        }

        public static void Opg12(Scanner input){

            int number;
            int resultat;
            int randomMin = 1;
            int randomMax = 10;
            int range = randomMax - randomMin + 1;
            int number1;
            int number2;
            int point = 0;

            for (int i = 1; i <=5; i++){
                number1 = (int)((Math.random()*range) + randomMin);
                number2 = (int)((Math.random()*range) + randomMin);
                resultat = number1 + number2;
                System.out.println("Hvad er: " + number1 + " + " + number2 + "?");
                number = input.nextInt();
                
                if (number == resultat){
                    System.out.println("Tillykke. Det var rigtigt");
                    point++;
                } else {
                    System.out.println("Det var desværre forkert");
                }
                
                System.out.println("Du har: " + point + "/" + i + " rigtige");
                System.out.println();
            }
        }

        public static void Opg13(Scanner input){
            
            int number = 0;
            int resultat = 0;
            int randomMin = 0;
            int randomMax = 10;
            int range = randomMax - randomMin + 1;
            int number1 = 0;
            int number2 = 0;
            int point = 0;
            int slut = 0;
            int antalOpgaver = 0;
            String operator = "";

            while (slut != 1){
                System.out.println("Hvor mange opgaver vil du have?");
                antalOpgaver = input.nextInt();

                System.out.println("Hvilke operatore vil du bruge?");
                input.nextLine(); // Consume the leftover newline
                operator = input.nextLine();

  
                switch(operator){
                    case "+":          
                            for (int i = 1; i <= antalOpgaver; i++){

                            System.out.println("Opgave: " + i + "/" + antalOpgaver);

                            number1 = (int)((Math.random()*range) + randomMin);
                            number2 = (int)((Math.random()*range) + randomMin);
                            resultat = number1 + number2;
                            System.out.println("Hvad er: " + number1 + " + " + number2 + "?");
                            number = input.nextInt();
                            if (number == resultat){
                            System.out.println("Tillykke. Det var rigtigt");
                            point++;
                            }else {
                            System.out.println("Det var desværre forkert");
                            }
                
                            System.out.println("Du har: " + point + "/" + antalOpgaver + " rigtige");
                            System.out.println();
                            } 
                        break;

                    case "-":
                        for (int i = 1; i <= antalOpgaver; i++){

                            System.out.println("Opgave: " + i + "/" + antalOpgaver);

                            number1 = (int)((Math.random()*range) + randomMin);
                            number2 = (int)((Math.random()*range) + randomMin);
                            resultat = number1 - number2;
                            System.out.println("Hvad er: " + number1 + " - " + number2 + "?");
                            number = input.nextInt();
                            if (number == resultat){
                            System.out.println("Tillykke. Det var rigtigt");
                            point++;
                            }else {
                            System.out.println("Det var desværre forkert");
                            }
                
                            System.out.println("Du har: " + point + "/" + antalOpgaver + " rigtige");
                            System.out.println();
                            } 
                        break;

                    case "*":
                        for (int i = 1; i <= antalOpgaver; i++){

                            System.out.println("Opgave: " + i + "/" + antalOpgaver);

                            number1 = (int)((Math.random()*range) + randomMin);
                            number2 = (int)((Math.random()*range) + randomMin);
                            resultat = number1 * number2;
                            System.out.println("Hvad er: " + number1 + " * " + number2 + "?");
                            number = input.nextInt();
                            if (number == resultat){
                            System.out.println("Tillykke. Det var rigtigt");
                            point++;
                            }else {
                            System.out.println("Det var desværre forkert");
                            }
                
                            System.out.println("Du har: " + point + "/" + antalOpgaver + " rigtige");
                            System.out.println();
                            } 
                        break;

                    case "/":
                        for (int i = 1; i <= antalOpgaver; i++){

                            System.out.println("Opgave: " + i + "/" + antalOpgaver);

                            number1 = (int)((Math.random()*range) + randomMin);
                            number2 = (int)((Math.random()*range) + randomMin);
                            resultat = number1 / number2;
                            System.out.println("Hvad er: " + number1 + " / " + number2 + "?");
                            number = input.nextInt();
                            if (number == resultat){
                            System.out.println("Tillykke. Det var rigtigt");
                            point++;
                            }else {
                            System.out.println("Det var desværre forkert");
                            }
                
                            System.out.println("Du har: " + point + "/" + antalOpgaver + " rigtige");
                            System.out.println();
                            } 
                        break;
                    default:
                        System.out.println("Ukendt operator. Brug +, -, * eller /.");
                        resultat = 0;
                        break;
                }
                System.out.println("Vil du afslutte? (1 for ja, 0 for nej)");
                slut = input.nextInt();
                }
            }
        }
    