package airConditioningInBuilding;

public class BasicAirConditioner extends AirConditioner{
    public static int DECREASE_TEMP_PER_M3 = 1;

    public BasicAirConditioner(double expectedTemperature, boolean isOn) {
        super(expectedTemperature, isOn);
    }

    @Override
    public void decreaseTemperature(Room room) {
        room.actualTemperature -= (DECREASE_TEMP_PER_M3/room.roomSize);
    }
}
