package airConditioningInBuilding;

public class ProAirConditioner extends AirConditioner {
    public static double DECREASE_TEMP_PER_M3 = 2;

    public ProAirConditioner(double expectedTemperature, boolean isOn) {
        super(expectedTemperature, isOn);
    }

    @Override
    public void decreaseTemperature(Room room) {
        double decrease = DECREASE_TEMP_PER_M3 / room.getRoomSize();
        System.out.println("Włączam klimę, temp obnizy sie o " + decrease);
        room.actualTemperature -= (decrease);
    }
}
