package airConditioningInBuilding;

public class Room {
    double actualTemperature;
    int roomNumber;
    int roomSize;
    AirConditioner airConditioner;

    public Room(double actualTemperature, int roomNumber, int roomSize, AirConditioner airConditioner) {
        this.actualTemperature = actualTemperature;
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.airConditioner = airConditioner;
    }

    public void modifyTemperature(){
        if (actualTemperature > airConditioner.getExpectedTemperature()) {
            airConditioner.setOn(true);
            airConditioner.decreaseTemperature();
        }else if(actualTemperature <= airConditioner.getExpectedTemperature()){
            airConditioner.setOn(false);
        }
    }

}
