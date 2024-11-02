
public class Driver {
    public static void main (String [] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("What size do you want?");
        String size = scnr.next();

        switch (size.toLowerCase()) {
            case "small":
                System.out.println("Person doesn't have a weapon")
                break;
            case "medium":
                System.out.println("Person has a weapon")
                break;
            case "large":
                System.out.println("I do not know if the person has a weapon")
                break;                 
            default:
                System.out.println("Invalid size selction");
                System.exit(1);
        }

        System.out.print("How many slices do you want? Options are 1-4");
        int slices = scnr.nextInt();

        switch (slices) {
            case 1:
                System.out.println("Danger level 1-2")
                break;
            case 2:
                System.out.println("Danger level 2-5")
                break;
            case 3:
                System.out.println("Danger Level 6-8")
                break;  
            case 4:
                System.out.println("Danger level 8-10")
                break;                 
            default:
                System.out.println("Invalid slizes selection");
                System.exit(1);
        }

        System.out.print("Would you like your order to be delivered. Respond with yes or no");
        String deliver = scnr.next();

        switch (deliver) {
            case "yes":
                System.out.println("In a crowded area")
                break;
            case "no":
                System.out.println("Not in a crowded area")
                break;                 
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        System.out.print("Would flavor would you like?");
        System.out.print("The options are vanilla, chocolate, strawberry, oreo, coffee");
        String flavor = scnr.next();

        switch (flavor) {
            case "vanilla":
                System.out.println("Sexual")
                break;
            case "chocolate":
                System.out.println("Physical")
                break;
            case "strawberry":
                System.out.println("Mental")
                break;  
            case "oreo":
                System.out.println("Gerneral Fear")
                break; 
            case "coffee":
                System.out.println("Gerneral Fear")
                break;                 
            default:
                System.out.println("Invalid slizes selection");
                System.exit(1);
        }

    }
}