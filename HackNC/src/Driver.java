
import java.util.Scanner;

public class Driver {

    private static User user;

    private static Scanner scan;

    private static Food foodChoice;

    private static String option;

    public static void main(String[] args) {
        boolean quitProgram = false;

        scan = new Scanner(System.in);

        user = createAccount(scan);

        chooseInterface(scan);

        while (!quitProgram) {
            displayMenu();
            if (option.compareToIgnoreCase("call") == 0) {
                foodChoice.callCopsRightNow();
                quitProgram = true;
            } else if (option.compareToIgnoreCase("order") == 0) {
                foodChoice.deliveryResponse(scan);
                generateReport();
            } else if (option.compareToIgnoreCase("offer") == 0) {
                foodChoice.panicButton(scan);
            } else if (option.compareToIgnoreCase("quit") == 0) {
                quitProgram = true;
            } else {
                System.out.println("Invalid Command");
            }
        }
        scan.close();
    }

    public static User createAccount(Scanner scnr1) {

        System.out.print("Name: ");
        String name = scnr1.next();

        System.out.print("Phone Number: ");
        String phoneNumber = scnr1.next();

        System.out.print("Email: ");
        String email = scnr1.next();

        System.out.print("Is your Location Enabled (yes or no): ");
        String userResponse1 = scnr1.next();
        boolean locationEnabled;
        if (userResponse1.toLowerCase().equals("yes")) {
            locationEnabled = true;
        } else {
            locationEnabled = false;
        }

        User user = new User(name, phoneNumber, email, locationEnabled);

        return user;
    }

    public static void chooseInterface(Scanner scnr2) {
        System.out.print("What food do you want: ");
        String foodOption = scnr2.next();

        if (foodOption.equalsIgnoreCase("pizza")) {
            foodChoice = new Pizza();

        }

    }

    public static void displayMenu() {
        option = "";

        System.out.print("Welcome " + user.getName() + ". What would you like to do?\n"
                + "Call - call a representative\n"
                + "Order - order a pizza\n"
                + "Offer - hold a button for an offer\n"
                + "Quit - exit the program\n");

        option = scan.next();
    }

    public static void generateReport() {
        System.out.println(user.getName() + " is in a " + foodChoice.getDangerSituation() + " situation.");
        String hasWeapon = "";
        if (foodChoice.hasWeapon) {
            hasWeapon = "has weapons";
        } else {
            hasWeapon = "does not have weapons";
        }
        System.out.println(user.getName() + "'s attacker " + hasWeapon + " and is in a danger level of "
                + foodChoice.getDangerLevel());
        String crowdedArea = "";
        if (foodChoice.isInCrowdedArea()) {
            crowdedArea = "crowded location.";
        } else {
            crowdedArea = "isolation location.";
        }
        System.out.println(user.getName() + " is in a " + crowdedArea);
        if (foodChoice.getDangerLevel() > 3) {
            System.out.println("Due to high risk situtation, calling cops now.");
        }
    }
}
