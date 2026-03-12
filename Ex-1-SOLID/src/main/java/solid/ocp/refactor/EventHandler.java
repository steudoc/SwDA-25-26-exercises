package solid.ocp.refactor;


public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        drivingMode.applyMode(this.vehicle);
    }
}
