
import java.util.Scanner;

public abstract class Food {

    /**
     * private boolean delivery = false;
     * private String size = "s";
     * private int slices = -1;
     * private int toppings = -1;
     */

    String dangerSituation;
    boolean hasWeapon;
    int dangerLevel;
    boolean inCrowdedArea;

    public Food() {
        // this.dangerSituation = "";
        // this.hasWeapon = false;
        // this.dangerLevel = 1;
        // this.inCrowdedArea = false;
    }

    public abstract void deliveryResponse(Scanner scan);

    public void setDangerSituation(String dangerSituation) {
        this.dangerSituation = dangerSituation;
    }

    public void setIsCrowded(boolean isCrowded) {
        this.inCrowdedArea = isCrowded;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public String getDangerSituation() {
        return this.dangerSituation;
    }

    public boolean getHasWeapon() {
        return this.hasWeapon;
    }

    public int getDangerLevel() {
        return this.dangerLevel;
    }

    public boolean isInCrowdedArea() {
        return inCrowdedArea;
    }

    public void callCopsRightNow() {
        System.out.println("Calling cops right now.");
        System.out.println("Cops have been reached at 911");
        System.out.println("Explain your situation in terms of a pizza store");
        System.out.println("Please be calm");
        System.out.println("Help is on the way now. We are tracking your location. Stay there and remain calm.");
    }

    public void panicButton(Scanner scan) {
        Thread waitingThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Holding Button. Enter \"safe\" if you feel safe\n" + //
                            "");
                    Thread.sleep(2000); // wait for 1 second
                }
            } catch (InterruptedException e) {
                // Thread interrupted, exit gracefully
            }
        });

        // Start the "waiting" thread
        waitingThread.start();

        // Main thread waits for user input
        System.out.println("Type 'safe' to stop the waiting message:");
        while (true) {
            String userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("safe")) {
                // Stop the "waiting" thread and exit the loop
                waitingThread.interrupt();
                break;
            }
        }
        System.out.println("Your video has been uploaded to the cloud.");
        System.out.println(
                "Enter your PIN to validate your safety. Failure to do so within a minute will result in calling the cops");
        String pin = scan.next();
        if (pin.compareTo("1234") == 0) {
            System.out.println("PIN entered successfully. You will now return to the main page.");
        }
    }
}
