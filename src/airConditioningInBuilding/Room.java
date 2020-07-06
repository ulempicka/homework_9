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
            //airConditioner.decreaseTemperature(Room room);
        }else if(actualTemperature <= airConditioner.getExpectedTemperature()){
            airConditioner.setOn(false);
        }
    }

//    public void decreaseTemperature() {
//        AirConditioner airConditioner = null;
//
//        if (airConditioner instanceof BasicAirConditioner) {
//            ((BasicAirConditioner)airConditioner).decreaseTemperature();
//
//        } else if (airConditioner instanceof ProAirConditioner) {
//            //((ProAirConditioner)airConditioner.decreaseTemperature();
//        }
//
//    }

    public void show(){
        System.out.println("Aktualna temperatura: " + actualTemperature + " , pokój: " + roomNumber + ", klima włączona? " + airConditioner.isOn());
    }

}
