import java.util.Arrays;
import java.util.Scanner;

public class DnDTerningSpil {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        
        int[] diceThrows = new int[5];
        diceThrows = arrayThrows(diceThrows);
        System.out.println(Arrays.toString(diceThrows));
    }


    public static int[] arrayThrows (int[] diceThrows){
        int[] dicer = {1,2,3,4,5,6};

        for (int i = 0; i < diceThrows.length; i++){
            diceThrows[i] = (int)(Math.random() * 6) + 1;
        }
        return diceThrows;
    }
}