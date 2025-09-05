import java.util.Locale;
import java.util.Scanner;

public class Main {

    // ANSI colors
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String DOT = "\u25CF";

    enum TimeOfDay { DAG, AFTEN, NAT }
    enum Traffic { LAV, HOJ }
    enum Area { BOLIG, ERHVERV, BLANDET }
    enum Emergency { JA, NEJ }

    // Small result containers
    record SignalResult(String label, String color, String msg) {}
    record AccessResult(String label, String color, String msg) {}

    private static String askOneOf(Scanner in, String prompt, String... options) {
        while (true) {
            System.out.println(prompt);
            String ans = in.nextLine().trim().toLowerCase(Locale.ROOT);
            for (String opt : options) {
                if (ans.equals(opt)) return ans;
            }
            System.out.println("Vælg venligst en gyldig mulighed: " + String.join("/", options));
        }
    }

    private static SignalResult determineSignal(TimeOfDay tod, Traffic traffic, Emergency emergency) {
        if (emergency == Emergency.JA) {
            return new SignalResult("GRØNT", GREEN, " - Nødsituation: prioriter udrykning!");
        }

        return switch (tod) {
            case DAG -> (traffic == Traffic.LAV)
                    ? new SignalResult("GRØNT", GREEN, " - Trafikken flyder frit!")
                    : new SignalResult("RØDT", RED, " - Trafikken er høj");
            case AFTEN -> new SignalResult("GULT", YELLOW, " - Der er lidt trafik");
            case NAT -> (traffic == Traffic.LAV)
                    ? new SignalResult("GULT", YELLOW, " - Der er lidt trafik")
                    : new SignalResult("RØDT", RED, " - Trafikken er høj");
        };
    }

    private static AccessResult determineAccess(Area area, Traffic traffic, TimeOfDay tod) {
        // bolig + nat always forbidden
        if (area == Area.BOLIG && tod == TimeOfDay.NAT) {
            return new AccessResult("FORBUDT", RED, " - Adgang nægtet");
        }

        return switch (area) {
            case ERHVERV, BLANDET -> (traffic == Traffic.LAV)
                    ? new AccessResult("TILLADT", GREEN, " - Adgang tilladt")
                    : new AccessResult("FORBUDT", RED, " - Adgang nægtet");
            case BOLIG -> new AccessResult("FORBUDT", RED, " - Adgang nægtet");
        };
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Map inputs to enums
            TimeOfDay tod = TimeOfDay.valueOf(askOneOf(input,
                    "Indtast tid på dagen (dag/aften/nat)", "dag", "aften", "nat").toUpperCase());
            Traffic traffic = Traffic.valueOf(askOneOf(input,
                    "Indtast trafikmængde (lav/høj)", "lav", "høj", "hoj").replace("ø", "o").toUpperCase());
            Area area = Area.valueOf(askOneOf(input,
                    "Indtast type område (bolig/erhverv/blandet)", "bolig", "erhverv", "blandet").toUpperCase());
            Emergency emergency = Emergency.valueOf(askOneOf(input,
                    "Er der en nødsituation? (ja/nej)", "ja", "nej").toUpperCase());

            // Decisions
            SignalResult sig = determineSignal(tod, traffic, emergency);
            AccessResult acc = determineAccess(area, traffic, tod);

            // Output
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("         STATUS");
            System.out.println();
            System.out.println(sig.color() + DOT + RESET + " " + sig.msg());
            System.out.println(acc.color() + DOT + RESET + " " + acc.msg());
            System.out.println();
            System.out.println("---------------------------");
        }
    }
}
