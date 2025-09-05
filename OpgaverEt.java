import java.util.Scanner;

public class OpgaverEt {
    public static void main(String[] args) {
        //Opg1(args);
        //Opg2(args);
        //Opg21();
        //Opg22();
        //Opg23();
        //Opg24();
        //Opg25();
        //Opg26();
        Opg27();
    }

    public static void Opg1(String[] args) {
        System.out.println("");
        System.out.println("    J      a     v        v     a");
        System.out.println("    J    a  a      v    v      a a");
        System.out.println("J   J   aaaaaa       v v      aaaaa");
        System.out.println(" J J    a    a        V       a   a");
    }

    public static void Opg2(String[] args) {
        System.out.println("a  a^2 a^3");
        System.out.println("1   1   1");
        System.out.println("2   4   8");
        System.out.println("3   9   27");
        System.out.println("4   16  64");
    }
    public static void Opg21(){
        int a = 1;
        double b = 2.5;
        char c = 'A';
        String d = "Hej";
        boolean e = true;
        System.out.println("int: " + a);
        System.out.println("double: " + b);
        System.out.println("char: " + c);
        System.out.println("String: " + d);
        System.out.println("boolean: " + e);
    }

    public static void Opg22(){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv venligst dit fornavn");
        String name = input.nextLine();
        System.out.println("Hvor gammel er du?");
        int alder = input.nextInt();
        double yndlingsDecimal = input.nextDouble();
        System.out.println("Dit navn er: " + name);
        System.out.println("Din alder er: " + alder);
        System.out.println("Dit yndlings decimal er: " + yndlingsDecimal);
        }
    
    public static void Opg23(){
        int a = 20;
        int b = 30;

        System.out.println("Addition: " + a+b);
        System.out.println("Substraktion: " + (a-b));
        System.out.println("Multiplikation: " + a*b);
        System.out.println("Division: " + a/b);
        System.out.println("Modulus: " + a%b);
        }
    
    public static void Opg24(){
        Scanner input = new Scanner(System.in);
        
        final double pi = 3.14;

        System.out.println("Hvad er radiusen?: ");
        double radius = input.nextDouble();
        double areal = pi * (radius * radius);

        System.out.println("Arealet er: " + areal);
        }

    public static void Opg25(){
        Scanner input = new Scanner(System.in);

        System.out.println("Hvad er længden? ");
        int length = input.nextInt();
        int areal = length * length;
        System.out.println("Arealet er: " + areal);
        }
    
    public static void Opg26(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor manger timer? ");
        int timer = input.nextInt();
        int sekunder = timer * 60 * 60;

        System.out.println("Det svarer til " + sekunder + " sekunder");
    }

    public static void Opg27(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor høj er du?");
        double height = input.nextDouble();
        System.out.println("Hvor meget vejer du?");
        int weight = input.nextInt();
        double bmi = weight / (height * height);
        System.out.println("Din BMI er: " + bmi);
    }
    }