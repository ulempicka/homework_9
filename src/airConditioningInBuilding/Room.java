package airConditioningInBuilding;

public class Room {
    double actualTemperature;
    private int roomNumber;
    private double roomSize;
    AirConditioner airConditioner;

    public Room(double actualTemperature, int roomNumber, int roomSize, AirConditioner airConditioner) {
        this.actualTemperature = actualTemperature;
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.airConditioner = airConditioner;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void show() {
        System.out.println("Aktualna temperatura: " + actualTemperature + " , pokój: " + roomNumber + ", klima włączona? " + airConditioner.isOn());
    }

}
