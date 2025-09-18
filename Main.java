import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int max = 10;
        int min = 1;
        System.out.println(random(min, max));
        
    }
    
    public static int random(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }
}
