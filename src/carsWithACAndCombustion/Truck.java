package carsWithACAndCombustion;

public class Truck extends Car {
    double cargoWeight;
    public static final double AC_INCREASE_COMBUSTION = 1.6;

    public Truck(String name, int tankVolume, double avgCombustion, boolean airCondEnabled, double cargoWeight) {
        super(name, tankVolume, avgCombustion, airCondEnabled);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateCombustion() {

//        if (cargoWeight > 0) {
//            if (getAirCond()) {
//                return getAvgCombustion() + (0.5 * (cargoWeight / 100)) + AC_INCREASE_COMBUSTION;
//            } else {
//                return getAvgCombustion() + (0.5 * (cargoWeight / 100));
//            }
//        } else if (cargoWeight == 0 && getAirCond()) {
//            return getAvgCombustion() + AC_INCREASE_COMBUSTION;
//        } else {
//            return getAvgCombustion();
//        }

        if (getAirCond() && cargoWeight == 0) {
            return getAvgCombustion() + AC_INCREASE_COMBUSTION;
        }else if(!getAirCond() && cargoWeight > 0) {
            return getAvgCombustion() + (0.5 * (cargoWeight / 100));
        }else if(getAirCond() && cargoWeight > 0){
            return getAvgCombustion() + (0.5 * (cargoWeight / 100)) + AC_INCREASE_COMBUSTION;
        }
        else {
            return getAvgCombustion();
        }
    }

    @Override
    public double calculateRange() {
        return super.calculateRange();
    }

    @Override
    public String info() {
        return super.info() + ", masa ładunku: " + cargoWeight + "kg";
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
