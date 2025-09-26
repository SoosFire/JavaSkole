import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Brugeren vælger størrelsen på arrayet
        System.out.print("Hvor mange tal vil du gemme i arrayet? ");
        int size = input.nextInt();
        input.nextLine();

        // Opret array og indlæs værdier fra brugeren
        String[] numbers = readArrayFromUser(input, size);

        // Visualiser array som tabel
        printArrayAsTable(numbers);

        // Udskriv forskellige egenskaber
        System.out.println(Arrays.toString(numbers));

    }

    /**
     * Metode til at indlæse tal fra brugeren
     */
    public static String[] readArrayFromUser(Scanner input, int size) {
        String[] arr = new String[size];
        System.out.println("Indtast " + size + " heltal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Tal " + i + ": ");
            arr[i] = input.nextLine();
        }
        return arr;
    }

    /**
     * Metode til at udskrive array som en tabel (indeks + værdi)
     */
    public static void printArrayAsTable(String[] arr) {
        System.out.println("\n--- Array visualisering (tabel) ---");

        // Først printes indekser
        System.out.print("Index: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
            System.out.println();
            System.out.println(i + ": " + arr[i]);
            }
        }
        System.out.println();
    }

    /**
     * Metode til at udskrive sum, gennemsnit, min, max osv.
     */
    public static void printArrayProperties(int[] arr) {
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int n : arr) {
            sum += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        double average = (double) sum / arr.length;

        System.out.println("--- Array egenskaber ---");
        System.out.println("Længde: " + arr.length);
        System.out.println("Sum: " + sum);
        System.out.println("Gennemsnit: " + average);
        System.out.println("Største værdi: " + max);
        System.out.println("Mindste værdi: " + min);

        // Udskriv array igen med for-each
        System.out.println("\n--- Udskrift med for-each ---");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}