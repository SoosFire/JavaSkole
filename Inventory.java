import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        List<String> inventoryList = new ArrayList<>();

        int invSpaces = input.nextInt();
        input.nextLine();

        for (int i = 0; i < invSpaces; i++){
            System.out.print("Skriv item #" + i + " -> ");
            String newItem = input.nextLine();
            inventoryList.add(newItem);
        }

        System.out.println("Her er dit inventory");
        System.out.println(inventoryList);

        System.out.println("Hvor mange opgaver vil du slette?");
        System.out.print("-> ");
        int deleteItems = input.nextInt();
        input.nextLine();

        for (int i = 0; i < deleteItems; i++){
            System.out.print("Slet item #" + i + ": ");
            String itemDelete = input.nextLine();
            inventoryList.remove(itemDelete);
        }

        System.out.println("Her er dit opdateret inventory");
        System.out.println(inventoryList);

    }
}