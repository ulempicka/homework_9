package airConditioningInBuilding;

public class BasicAirConditioner extends AirConditioner{
    public static double DECREASE_TEMP_PER_M3 = 1;

    public BasicAirConditioner(double expectedTemperature, boolean isOn) {
        super(expectedTemperature, isOn);
    }

    @Override
    public void decreaseTemperature(Room room) {
        double decrease = DECREASE_TEMP_PER_M3 / room.getRoomSize();
        System.out.println("Włączam klimę, temp obnizy sie o " + decrease);
        room.actualTemperature -= (decrease);
    }
}
