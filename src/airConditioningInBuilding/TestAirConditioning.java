package airConditioningInBuilding;

public class TestAirConditioning {
    public static void main(String[] args) {

        AirConditioner conditioner1 = new BasicAirConditioner(22, false);
        AirConditioner conditioner2 = new ProAirConditioner(20, false);
        AirConditioner conditioner3 = new BasicAirConditioner(21, false);

        Room room1 = new Room(28, 1, 4, conditioner1);
        Room room2 = new Room(32, 2, 15, conditioner2);
        Room room3 = new Room(20, 3, 6, conditioner3);

        room1.show();
        modifyTemperature(room1, conditioner1);
        modifyTemperature(room1, conditioner1);
        modifyTemperature(room1, conditioner1);
        room1.show();

        room2.show();
        modifyTemperature(room2, conditioner2);
        room2.show();

        room3.show();
        modifyTemperature(room3, conditioner3);
        room3.show();

    }

    private static void modifyTemperature(Room room, AirConditioner conditioner) {
        if (room.actualTemperature > conditioner.getExpectedTemperature()) {
            conditioner.setOn(true);
            conditioner.decreaseTemperature(room);
        } else if (room.actualTemperature <= conditioner.getExpectedTemperature()) {
            conditioner.setOn(false);
        }
    }

}
