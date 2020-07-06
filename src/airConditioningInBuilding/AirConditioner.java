package airConditioningInBuilding;

public class AirConditioner {
    private double expectedTemperature;
    private boolean isOn;

    public AirConditioner(double expectedTemperature, boolean isOn) {
        this.expectedTemperature = expectedTemperature;
        this.isOn = isOn;
    }

    public double getExpectedTemperature() {
        return expectedTemperature;
    }

    public void setExpectedTemperature(double expectedTemperature) {
        this.expectedTemperature = expectedTemperature;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void decreaseTemperature(Room room) {
        AirConditioner airConditioner = null;

        if (airConditioner instanceof BasicAirConditioner) {
            (airConditioner).decreaseTemperature(room);

        } else if (airConditioner instanceof ProAirConditioner) {
            airConditioner.decreaseTemperature(room);
        }

    }

}

