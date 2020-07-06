package carsWithACAndCombustion;

public class TestCars {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota Yaris", 45, 4.5, false);
        vehicles[1] = new Truck("Star 244", 150, 26, false, 1000);
        double range;

        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
            range = vehicle.calculateRange();
            System.out.println("Zasięg " + range);
        }

        vehicles[0].setAirCond(true);
        vehicles[1].setAirCond(true);

        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
            range = vehicle.calculateRange();
            System.out.println("Zasięg " + range);
        }
    }
}

