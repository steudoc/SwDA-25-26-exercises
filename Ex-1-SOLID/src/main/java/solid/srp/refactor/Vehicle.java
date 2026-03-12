package solid.srp.refactor; 


public class Vehicle {

    private int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = Math.clamp(remainingFuel, 0, this.maxFuel);
    }

}
