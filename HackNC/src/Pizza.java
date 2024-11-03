import java.util.Scanner;

public class Pizza extends Food {
    String dangerSituation;
    boolean hasWeapon;
    int dangerLevel;
    boolean inCrowdedArea;

    public Pizza() {
        super();

    }

    @Override
    public void deliveryResponse(Scanner scnr) {
        //scnr = new Scanner(System.in);

        System.out.println("What toppings would you like?");
        System.out.println("The options are vegetables, chicken, pepperoni, olives");
        String flavor = scnr.next();
        
        switch (flavor.toLowerCase()) {
            case "vegetables":
                setDangerSituation("Sexual");
                break;
            case "chicken":
                setDangerSituation("Physical");
                break;
            case "pepperoni":
                setDangerSituation("Mental");
                break;
            case "olives":
                setDangerSituation("General Fear");
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.out.println("What size do you want?");
        String size = scnr.next();
        
        switch (size.toLowerCase()) {
            case "small":
                setHasWeapon(false);
                break;
            case "medium":
                setHasWeapon(true);
                break;
            case "large":
                setHasWeapon(true);
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.out.println("How many slices do you want? Options are 1-4");
        int slices = scnr.nextInt();
        setDangerLevel(slices);

        System.out.println("Would you like your order to be delivered. Respond with yes or no");
        String deliver = scnr.next();

        switch (deliver) {
            case "yes":
                setIsCrowded(true);
                break;
            case "no":
                setIsCrowded(false);
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

    }

}
    
