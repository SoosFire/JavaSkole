import java.util.Scanner;

public class FilmNørderi {

    static Scanner input = new Scanner (System.in);
    public static void main (String [] args){

        int listLength = 5;
        String[] moviesArr = moviesArray(listLength);
        listArray(moviesArr, listLength);
        modifyArray(moviesArr);
        listArray(moviesArr, listLength);

    }

    public static String[] moviesArray(int listLength){
        System.out.println("Skriv dine top 5 film!");
        String moviesArr[] = new String[5];
        for (int i = 0; i < moviesArr.length; i++){
            System.out.print("Film " + (i+1) + ": ");
            moviesArr[i] = input.nextLine();
        }
        return moviesArr;
    }

    public static void listArray (String[] moviesArr, int listLength){
        System.out.println();
        System.out.println("Her er dine film!");
        for (int i = 0; i < moviesArr.length; i++){
            System.out.println("Film " + (i +1) + ": " + moviesArr[i]);
        }
    }

    public static void modifyArray(String[] moviesArr) {
        System.out.println("Hvilken film vil du udskifte? (1-5)");
        int choice = input.nextInt() - 1; // Adjust for zero-based index
        input.nextLine(); // Clear the buffer
        for (int i = 0; i < moviesArr.length; i++) {
            if (i == choice) {
                System.out.print("Indtast ny film: ");
                moviesArr[i] = input.nextLine();
            }
        }
    }
}
