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

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void decreaseTemperature(Room room) {
    }

}

