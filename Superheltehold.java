import java.util.Scanner;

public class Superheltehold {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        
        String[] nameArr = {"Petersen", "Sørensen", "Mikesen", "Persen", "Bosen"};
        countArr(nameArr);

    }

    public static void countArr (String[] nameArr){
        for (int i = 0; i < nameArr.length; i++){
            if (nameArr[i].length() > 7){
                System.out.println(nameArr[i]);
            }
        }
    }
}
