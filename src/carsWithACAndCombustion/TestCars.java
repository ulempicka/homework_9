package carsWithACAndCombustion;

public class TestCars {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota Yaris", 45, 4.5, false);
        vehicles[1] = new Truck("Star 244", 150, 26, false, 1000);
        double carRange;
        double truckRange;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car1 = (Car) vehicle;
                car1.showInfo();
                carRange = car1.calculateRange();
                car1.showRange(carRange);

            } else if (vehicle instanceof Truck) {
                Truck truck1 = (Truck) vehicle;
                truck1.showInfo();
                truckRange = truck1.calculateRange();
                truck1.showRange(truckRange);
            }
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car1 = (Car) vehicle;
                car1.setAirCond(true);
                car1.showInfo();
                carRange = car1.calculateRange();
                car1.showRange(carRange);
            } else if (vehicle instanceof Truck) {
                Truck truck1 = (Truck) vehicle;
                truck1.setAirCond(true);
                truck1.showInfo();
                truckRange = truck1.calculateRange();
                truck1.showRange(truckRange);
            }
        }
    }
}
