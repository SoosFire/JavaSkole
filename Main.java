import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                System.out.println("String #"+ (i+1));
                String s1 = sc.next();
                System.out.println("Integer #"+ (i+1));
                int x = sc.nextInt();
                System.out.println("================================");
                if (x > 99){
                    System.out.printf("%-15s %d\n", s1, x);
                } else {
                System.out.printf("%-16s %d\n ", s1, x);
                }
            }
            System.out.println("================================");

    }
}
