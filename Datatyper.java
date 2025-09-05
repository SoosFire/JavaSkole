public class Datatyper {
    public static void main(String[] args) {
        int totalSlices = 8;
        int friends = 3;
        int slicedPerFriend = totalSlices / friends;
        int leftOver = totalSlices % friends;

        System.out.println("Hver ven får " + slicedPerFriend + " stykker pizza");
        System.out.println("Der er " + leftOver + " stykker pizza til overs");
    }
}
