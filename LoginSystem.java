import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {

    static Scanner input = new Scanner (System.in);
    static ArrayList<String> users = new ArrayList<>();
    static ArrayList<String> passwords = new ArrayList<>();

    public static void main(String [] args){

        System.out.println("Velkommen til loginsiden");
        System.out.println("Her er menuen:");
        
        do {
        welcomeMessage();
        String choice = input.nextLine().toLowerCase().toString();
        choiceSelect(choice);
        } while (selectNewChoice());

    }

    public static void welcomeMessage(){
        System.out.println();
        System.out.println("1) Opret ny konto");
        System.out.println("2) Login");
        System.out.println("3) Afslut");
        System.out.println();
        System.out.print("->  ");
    }

    public static void choiceSelect(String choice){
        switch (choice){
            case "1":
            case "opret":
            case "ny":
            case "opret ny konto":
                addUser();
                addPass();
                break;      

            case "2":
            case "login":
                loginSystem(users, passwords);
                break;

            case "3":
            case "afslut":
                break;

            default:
                System.out.println("Ikke gyldigt svar. Lukker ned..");
                break;
        }
    }

    public static void addUser(){
        System.out.println("Opret nyt brugernavn");
        System.out.print("-> ");
        String name = input.nextLine();
        users.add(name);
    }

    public static void addPass(){
        System.out.println("Opret nyt kodeord");
        System.out.print("-> ");
        String pass = input.nextLine();
        passwords.add(pass);
    }

    public static boolean selectNewChoice (){
        System.out.println();
        System.out.println("Vil du gå tilbage til menuen?");
        System.out.println("Ja: Gå tilbage til menuen");
        System.out.println("Nej: Afslut programmet");
        System.out.print("->  ");
        String newChoice = input.nextLine().toLowerCase();
        switch (newChoice){
            case "ja":
                return true;
            case "nej":
                return false;
            default:
                return false;
        }
    }

    public static void loginSystem (ArrayList<String> users, ArrayList<String> passwords){
        int attemptsLeft = 3;
        while (attemptsLeft >= 1){
        System.out.println();
        System.out.println("Skriv dit brugernavn:");
        System.out.print("->    ");
        String username = input.nextLine();
        System.out.println();
        System.out.println("Skriv dit kodeord");
        System.out.print("->    ");
        String password = input.nextLine();
        int index = users.indexOf(username);
        if (index != -1){
            if (username.equals(users.get(index))){
                String correctPassword = passwords.get(index); 
                if (correctPassword.equals(password)){
                    System.out.println("Login lykkedes");
                    attemptsLeft = 0;
                } else {
                    System.out.println("Login mislykkedes");
                    System.out.println("Forkert kodeord");
                    System.out.println("Du har "+ (attemptsLeft) + " forsøg tilbage");
                    attemptsLeft--;
                    if (attemptsLeft == 0){
                        System.out.println("Du har brugt alle dine forsøg. Lukker ned..");
                        }
                    }
                }
            }
            
            if (!users.contains(username)){
                System.out.println("Login mislykkedes");
                System.out.println("Brugernavn findes ikke");
                System.out.println("Du har "+ (attemptsLeft) + " forsøg tilbage");
                attemptsLeft--;
                if (attemptsLeft == 0){
                    System.out.println("Du har brugt alle dine forsøg. Lukker ned..");
                }
            }
        }
    }
}
