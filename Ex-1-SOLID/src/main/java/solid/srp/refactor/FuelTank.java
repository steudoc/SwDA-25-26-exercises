package solid.srp.refactor;

public class FuelTank {

    public void reFuel(Vehicle v){
        v.setRemainingFuel(v.getMaxFuel());
    }

    public void reFuel(Vehicle v, int newFuel){
        v.setRemainingFuel(v.getRemainingFuel() + newFuel);      
    }
}
