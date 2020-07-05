package carsWithACAndCombustion;

public class TestCars {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota Yaris", 45, 4.5, false);
        vehicles[1] = new Truck("Star 244", 150, 26, false, 1000);
        double carCombustion;
        double carRange;
        double truckCombustion;
        double truckRange;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car1 = (Car) vehicle;
                car1.showInfo();
                carCombustion = car1.calculateCombustion();
                carRange = car1.calculateRange(carCombustion);
                car1.showRange(carRange);

            } else if (vehicle instanceof Truck) {
                Truck truck1 = (Truck) vehicle;
                truck1.showInfo();
                truckCombustion = truck1.calculateCombustion();
                truckRange = truck1.calculateRange(truckCombustion);
                truck1.showRange(truckRange);
            }
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car1 = (Car) vehicle;
                car1.setAirCond(true);
                car1.showInfo();
                carCombustion = car1.calculateCombustion();
                carRange = car1.calculateRange(carCombustion);
                car1.showRange(carRange);
            } else if (vehicle instanceof Truck) {
                Truck truck1 = (Truck) vehicle;
                truck1.setAirCond(true);
                truck1.showInfo();
                truckCombustion = truck1.calculateCombustion();
                truckRange = truck1.calculateRange(truckCombustion);
                truck1.showRange(truckRange);
            }

        }
    }
}
