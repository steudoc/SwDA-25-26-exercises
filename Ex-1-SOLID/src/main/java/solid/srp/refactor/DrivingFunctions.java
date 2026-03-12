package solid.srp.refactor;

public class DrivingFunctions {

    public void accelerate(Vehicle v) {
        v.setRemainingFuel(v.getRemainingFuel() - 1);
    }
}
