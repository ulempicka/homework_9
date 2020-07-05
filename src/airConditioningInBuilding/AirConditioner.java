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

    public void decreaseTemperature() {
        AirConditioner airConditioner = null;

        if (airConditioner instanceof BasicAirConditioner) {
            ((BasicAirConditioner)airConditioner).decreaseTemperature();

        } else if (airConditioner instanceof ProAirConditioner) {
            //((ProAirConditioner)airConditioner.decreaseTemperature();
        }

    }

}

