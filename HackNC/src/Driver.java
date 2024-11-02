
import java.util.Scanner;

public class Driver {

    private static User user;

    public static void main(String[] args) {
        user = createAccount();
        chooseInterface();
    }

    public static User createAccount() {

        Scanner scnr1 = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scnr1.next();

        System.out.print("Phone Number: ");
        String phoneNumber = scnr1.next();

        System.out.print("Email: ");
        String email = scnr1.next();

        System.out.print("Is your Location Enabled: ");
        String userResponse1 = scnr1.next();
        boolean locationEnabled;
        if (userResponse1.toLowerCase().equals("yes")) {
            locationEnabled = true;
        } else {
            locationEnabled = false;
        }

        System.out.print("Location: ");
        String location = scnr1.next();

        System.out.print("Are you a volunteer?: ");
        String userResponse2 = scnr1.next();
        boolean isVolunteer;
        if (userResponse2.toLowerCase().equals("yes")) {
            isVolunteer = true;
        } else {
            isVolunteer = false;
        }
        scnr1.close();

        User user = new User(name, phoneNumber, email, locationEnabled, location, isVolunteer);

        return user;
    }

    public static void chooseInterface() {
        Scanner scnr2 = new Scanner(System.in);
        System.out.print("What food do you want: ");
        String foodOption = scnr2.next();

        if (foodOption.equalsIgnoreCase("pizza")) {
            Food foodChoice = new Pizza();

            if (foodChoice.getDangerSituation().equals("Sexual")) {
                System.out.println("" + user.getName() + " is in a sexual danger situation");
                if (foodChoice.getHasWeapon()) {
                    System.out.println(user.getName() + "'s attacker has weapons");
                    if (foodChoice.getDangerLevel() == 1) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 2) {
                        System.out.println(user.getName() + " is in danger level 2");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 3) {
                        System.out.println(user.getName() + " is in danger level 3");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 4) {
                        System.out.println(user.getName() + " is in danger level 4");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    }
                }
            }

            if (foodChoice.getDangerSituation().equals("Physical")) {
                System.out.println("" + user.getName() + " is in a physical danger situation");
                if (foodChoice.getHasWeapon()) {
                    System.out.println(user.getName() + "'s attacker has weapons");
                    if (foodChoice.getDangerLevel() == 1) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 2) {
                        System.out.println(user.getName() + " is in danger level 2");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 3) {
                        System.out.println(user.getName() + " is in danger level 3");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 4) {
                        System.out.println(user.getName() + " is in danger level 4");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    }
                }
            }

            if (foodChoice.getDangerSituation().equals("Mental")) {
                System.out.println("" + user.getName() + " is in a mental danger situation");
                if (foodChoice.getHasWeapon()) {
                    System.out.println(user.getName() + "'s attacker has weapons");
                    if (foodChoice.getDangerLevel() == 1) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 2) {
                        System.out.println(user.getName() + " is in danger level 2");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 3) {
                        System.out.println(user.getName() + " is in danger level 3");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 4) {
                        System.out.println(user.getName() + " is in danger level 4");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    }
                }
            }

            if (foodChoice.getDangerSituation().equals("General Fear")) {
                System.out.println("" + user.getName() + " is in a general fear danger situation");
                if (foodChoice.getHasWeapon()) {
                    System.out.println(user.getName() + "'s attacker has weapons");
                    if (foodChoice.getDangerLevel() == 1) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 2) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 3) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    } else if (foodChoice.getDangerLevel() == 4) {
                        System.out.println(user.getName() + " is in danger level 1");
                        if (foodChoice.isInCrowdedArea()) {
                            System.out.println(user.getName() + " is in a crowded area");
                        } else {
                            System.out.println(user.getName() + " is not in a crowded area");
                        }
                    }
                }
            }
        } else if (foodOption.equalsIgnoreCase("cake")) {
            // To do
        }

        scnr2.close();
    }
}
