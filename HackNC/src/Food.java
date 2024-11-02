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
    }

    public abstract void deliveryResponse();

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

}
