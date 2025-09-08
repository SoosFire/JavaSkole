import java.util.Scanner;

public class Byplanlaeggeren {
    enum TimeOfDay{
            DAG, AFTEN, NAT
        }
    public static void main(String[]args) {
        try (Scanner input = new Scanner(System.in)) {

        

        // Bruger input
        TimeOfDay timeDay = null;
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
            String timeDayInput = input.nextLine().toUpperCase();
            try {
                timeDay = TimeOfDay.valueOf(timeDayInput.toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
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
        switch (timeDay){
            case DAG:
                if (amountTraffic.equals("lav") || emergency.equals("ja")){
                    farveSignal = signalGrønt;
                    beskedStatus = " - Trafikken flyder frit!";
                    break;
                }
            case AFTEN:
                    farveSignal = signalGult;
                    beskedStatus = " - Der er lidt trafik";
                    break;
                
            case NAT:
                if (amountTraffic.equals("lav")){
                    farveSignal = signalGult;
                    beskedStatus = " - Der er lidt trafik";
                } else {
                    farveSignal = signalRødt;
                    beskedStatus = " - Trafikken er høj";
                }
                    break;
            default:
                beskedStatus = "Fejl: Vi kan ikke se trafikken lige nu";
                farveSignal = signalRødt;
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