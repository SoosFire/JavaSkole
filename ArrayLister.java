import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArrayLister {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        Map<String, Integer> fruitCounts = new HashMap<>();


        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Lemon");
        fruits.add("Cucumber");
        fruits.add("Mango");
        fruits.add("Orange");

        for (String fruit : fruits){
            if (fruitCounts.containsKey(fruit)){
                fruitCounts.put(fruit, fruitCounts.get(fruit) + 1);
            } else {
                fruitCounts.put(fruit, 1);
            }
        }
       
        System.out.println("Fruit counts:");
        for (Map.Entry<String, Integer> entry : fruitCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}