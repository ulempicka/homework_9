package airConditioningInBuilding;

public class TestAirConditioning {
    public static void main(String[] args) {

        AirConditioner conditioner1 = new BasicAirConditioner(22,false);
        AirConditioner conditioner2 = new ProAirConditioner(20,false);

        Room room1 = new Room(28, 1, 75, conditioner1);
        Room room2 = new Room(32, 2, 150, conditioner2);

    }

}
