import java.io.*;
import java.util.Scanner;

public class JavaExceptions {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        

    }

    // Metode -> Undtagelsesudbredelse catch

    public static void numberToCatch() {
        int number = 1;
        try {
            number = number + Integer.parseInt(input.nextLine());
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Fejl: Ikke et helt tal");
        }
        number = number + Integer.parseInt(input.nextLine());
        System.out.println(number);
    }

    // InvalidAgeRestriction -> User defined exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Must be over 18");
        }
        System.out.println("Access granted");

    }

    // Finally catch
    public static void finallyCatch() {
        try {
            int number = 0;
            number = number + Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Fejl: NumberFormatException");
        } catch (Exception e) {
            System.out.println("Fejl: Exception");
        } finally {
            System.out.println("The try-catch is finished");
        }
    }

    // Undtagelseudbredelse catch
    public static void undtagelsesUdbredelse() {
        try {
            numberToCatch();
        } catch (Exception e) {
            System.out.println("Fejl!!!");
        }
    }

    // IO-Exception - File read
    public static void IOExceptionCatch() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/jonas/Desktop/output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Fejl: Fil er ikke fundet");
        }
    }

    // Array out of bound exception
    public static void ArrayOutOfBoundsCatch () {
                int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fejl: Indekset findes ikke");
        }
    }

    // Brugerdefinerede exception
    public static void userDefinedException () {
                try {
            validateAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());

        }
    }

    

}