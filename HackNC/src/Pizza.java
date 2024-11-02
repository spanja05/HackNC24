
import java.util.Scanner;

public class Pizza extends Food {
    String dangerSituation;
    boolean hasWeapon;
    int dangerLevel;
    boolean inCrowdedArea;

    public Pizza() {

    }

    @Override
    public void deliveryResponse() {
        Scanner scnr = new Scanner(System.in);

        System.out.print("What toppings would you like?");
        System.out.print("The options are vegetables, chicken, pepperoni, olives");
        String flavor = scnr.next();

        switch (flavor.toLowerCase()) {
            case "vegetables":
                dangerSituation = "Sexual";
                break;
            case "chicken":
                dangerSituation = "Physical";
                break;
            case "pepperoni":
                dangerSituation = "Mental";
                break;
            case "olives":
                dangerSituation = "General Fear";
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.out.print("What size do you want?");
        String size = scnr.next();

        switch (size.toLowerCase()) {
            case "small":
                hasWeapon = false;
                break;
            case "medium":
                hasWeapon = true;
                break;
            case "large":
                hasWeapon = true;
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.out.print("How many slices do you want? Options are 1-4");
        int slices = scnr.nextInt();

        switch (slices) {
            case 1:
                dangerLevel = 1;
                break;
            case 2:
                dangerLevel = 2;
                break;
            case 3:
                dangerLevel = 3;
                break;
            case 4:
                dangerLevel = 4;
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.out.print("Would you like your order to be delivered. Respond with yes or no");
        String deliver = scnr.next();

        switch (deliver) {
            case "yes":
                inCrowdedArea = true;
                break;
            case "no":
                inCrowdedArea = true;
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        scnr.close();

    }

}
