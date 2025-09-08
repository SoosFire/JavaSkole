import java.util.Scanner;

public class KapitelTre {
    public static void main(String [] args) {
        Opg8();
    }

    public static void Opg1() {
        int max = 100;
        int min = -100;
        int number;
        
        number = (int) (Math.random() * (max-min +1) + min);
        System.out.println(number);
        if (number <= 0){
            System.out.println("Det er under frysepunktet");
        }
    }

    public static void Opg2(){
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();

        if (number >= 18){
            System.out.println("Du er myndig");
        } else {
            System.out.println("Du er ikke myndig");
        }
    }

    public static void Opg3(){
        Scanner input = new Scanner (System.in);
        String spilEt = input.nextLine().toLowerCase();

        if (spilEt.equals("minecraft")){
            System.out.println("Lad os bygge sammen!");
        }
        else if (spilEt.equals("counter strike")){
            System.out.println("Lad os dræbe sammen!");
        }
        else {
            System.out.println("Spillet findes ikke. Lad os studere sammen!");
        }
    }

    public static void Opg4(){
        Scanner input = new Scanner (System.in);
        String username = input.nextLine();
        String password = input.nextLine();

        if (username.equals("Jonas")){
            if (password.equals("Kodeord")){
                System.out.println("Du har adgang");
            } else {
                System.out.println("Kodeordet er desværre forkert");
            }
        }
        else {
            System.out.println("Du har ikke adgang");
        }
    }

    public static void Opg5(){
    
        Scanner input = new Scanner(System.in);
        
        boolean isVip = true;
        boolean isAgeOk;
        boolean forbud = false;
        int age = 23;
        String name;

        if (age > 18){
            isAgeOk = true;
        } else {
            isAgeOk = false;
        }
        
        name = input.nextLine();
        if (name.equals("Jonas")){
            if (isVip || isAgeOk && !forbud){
                System.out.println("Du har adgang til festen");
            } else {
                System.out.println("Du har IKKE adgang til festen");
            }
        } else {
            System.out.println("Indtast et rigtigt navn");
        }
    }

    public static void Opg6(){

        Scanner input = new Scanner (System.in);
        String ugeDag = "";
        int ugeDagTal = input.nextInt();

        switch (ugeDagTal){
            case 1: 
                ugeDag = "Mandag";
                break;
            case 2:
                ugeDag = "Tirsdag";
                break;
            case 3: 
                ugeDag = "Onsdag";
                break;
            case 4:
                ugeDag = "Torsdag";
                break;
            case 5:
                ugeDag = "Fredag";
                break;
            case 6: 
                ugeDag = "Lørdag";
                break;
            case 7:
                ugeDag = "Søndag";
                break;
            default:
                System.out.println("Skriv et tal næste gang");
        }
        System.out.println(ugeDag);
    }

    public static void Opg7(){
        Scanner input = new Scanner (System.in);
        int årsTal;
        String isSkudÅr = "";
        årsTal = input.nextInt();

        isSkudÅr = ((årsTal % 4 == 0) || (årsTal % 100 == 0) && årsTal % 400 == 0) ? "Det er skudår": "Det er ikke skudår";
        System.out.println(isSkudÅr);
    }

    public static void Opg8(){
        Scanner input = new Scanner (System.in);

        int spilValgt;
        int spilEt = 1;
        int spilTo = 2;
        int spilTre = 3;

        int scoreSpilEt = 0;
        int scoreSpilTo = 0;
        int scoreSpilTre = 0;

        System.out.println("Vælg venligst et af spilene");
        System.out.println("Mario (1) / CS (2) / Tetris (3)");

        spilValgt = input.nextInt();

        switch (spilValgt){
            case 1:
                System.out.println("Hvad er din score i Mario?");
                scoreSpilEt = input.nextInt();
                break;
            case 2:
                System.out.println("Hvad er din score i CS?");
                scoreSpilTo = input.nextInt();
                break;
            case 3:
                System.out.println("Hvad er din score i Tetris?");
                scoreSpilTre = input.nextInt();
                break;
        }
        System.out.println("Din score i Mario er: " + scoreSpilEt);
        System.out.println("Din score i CS er: " + scoreSpilTo);
        System.out.println("Din score i Tetris er: " + scoreSpilTre);
    }
}