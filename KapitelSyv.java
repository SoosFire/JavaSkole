import java.util.Scanner;

public class KapitelSyv {

    static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        Opgave1();
    }

    public static void Opgave1 (){

        int amount = 10;
        int arr[] = new int[amount];
        int sum = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < amount; i++){
            System.out.print("Skriv tal nummer " + i + ": ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < amount; i++){
            System.out.println("Tal " + i + ": " + arr[i]);;
            sum += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        int avarageNumbers = sum / amount;
        System.out.println("Gennemsnittet er: " + avarageNumbers);
        System.out.println("Mindste tal er: " + min);
        System.out.println("Højeste tal er: " + max);

    }

    
}
