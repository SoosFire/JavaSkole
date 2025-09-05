import java.util.Scanner;

public class Byplanlaeggeren {
    public static void main(String[]args) {
        try (Scanner input = new Scanner(System.in)) {

        // Bruger input
        String timeDay = "";
        String amountTraffic = "";
        String typeArea = "";
        String emergency = "";

        // Status beskeder
        String farveSignal = "";
        String farveAdgang;
        String beskedStatus;
        String beskedAdgang;

        // Farve koder
        String signalGrønt = "\u001B[32m\u25CF\u001B[0m";
        String signalGult = "\u001B[33m\u25CF\u001B[0m";
        String signalRødt = "\u001B[31m\u25CF\u001B[0m";

        // --------------------------------------------------------------------- //
        // Scanner inputs

        // Tidspunkt
        System.out.println("Indtast tid på dagen (dag/aften/nat)");
        while (true){
        timeDay = input.nextLine().toLowerCase();
            if (timeDay.equals("dag") || timeDay.equals("aften") || timeDay.equals("nat")){
                break;
            } else {
                System.out.println("Vælg venligst en gyldig tid på dagen");
            }
        }

        // Trafik
        System.out.println("Indtast trafikmængde (lav/høj)");
        while (true){
        amountTraffic = input.nextLine().toLowerCase();
            if (amountTraffic.equals("lav") || amountTraffic.equals("høj")){
                break;
            } else {
                System.out.println("Vælg venligst en gyldig trafikmængde");
            }
        }

        // Område
        System.out.println("Indtast type område (bolig/erhverv/blandet)");
        while (true){
        typeArea = input.nextLine().toLowerCase();
            if (typeArea.equals("bolig") || typeArea.equals("erhverv") || typeArea.equals("blandet")){
                break;
            } else {
                System.out.println("Vælg venligst et gyldigt område");
            }
        }

        // Nødstilfælde
        System.out.println("Er der en nødsituation? (ja/nej)");
        while (true){
        emergency = input.nextLine().toLowerCase();
            if (emergency.equals("ja") || emergency.equals("nej")){
                break;
            } else {
                System.out.println("Angiv om det er et nødstilfælde");
            }
        }


        // --------------------------------------------------------------------- //
        // LYSSIGNAL

        // GRØNT lys
        if ((timeDay.equals("dag") && amountTraffic.equals("lav")) || emergency.equals("ja")){
            farveSignal = signalGrønt;
            beskedStatus = " - Trafikken flyder frit!";
        } 

        // GULT lys
        else if (timeDay.equals("aften") || (timeDay.equals("nat") && amountTraffic.equals("lav"))){
            farveSignal = signalGult;
            beskedStatus = " - Der er lidt trafik";
        }

        // RØDT lys
        else if ((timeDay.equals("nat") && amountTraffic.equals("høj")) || amountTraffic.equals("høj")){
            farveSignal = signalRødt;
            beskedStatus = " - Trafikken er høj";
        }
        else {
            beskedStatus = ("Fejl: Vi kan ikke se trafikken lige nu");
        }

        // --------------------------------------------------------------------- //
        // ADGANG

        // TILLADT adgang
        if ((typeArea.equals("erhverv") || typeArea.equals("blandet")) && amountTraffic.equals("lav")){
            farveAdgang = signalGrønt;
            beskedAdgang = " - Adgang tilladt";
        } else {
            farveAdgang = signalRødt;
            beskedAdgang = " - Adgang nægtet";
        }

        // PRINT RESULTAT
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("           STATUS");
        System.out.println("");
        System.out.println(farveSignal + beskedStatus);
        System.out.println(farveAdgang + beskedAdgang);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        }
    }
}