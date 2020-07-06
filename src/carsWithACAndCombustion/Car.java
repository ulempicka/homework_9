package carsWithACAndCombustion;

public class Car extends Vehicle{
    boolean airCond;
    public static final double AC_INCREASE_COMBUSTION = 0.8;

    public Car(String name, int tankVolume, double avgCombustion, boolean airCond) {
        super(name, tankVolume, avgCombustion);
        this.airCond = airCond;
    }

    public boolean getAirCond() {
        return airCond;
    }

    @Override
    public void setAirCond(boolean airCond) {
        this.airCond = airCond;
    }

    public double calculateCombustion(){
        if (airCond){
            return getAvgCombustion() + AC_INCREASE_COMBUSTION;
        }else {
            return getAvgCombustion();
        }
    }

    @Override
    public double calculateRange(){
        System.out.println("spalanie " + calculateCombustion());
        return (getTankVolume() * 100) / (calculateCombustion());
    }

    @Override
    public String info() {
        return super.info() + ", klima włączona: " + airCond;
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
