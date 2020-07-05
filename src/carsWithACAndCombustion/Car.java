package carsWithACAndCombustion;

public class Car extends Vehicle{
    boolean airCond;

    public Car(String name, int tankVolume, double avgCombustion, boolean airCond) {
        super(name, tankVolume, avgCombustion);
        this.airCond = airCond;
    }

    public boolean getAirCond() {
        return airCond;
    }

    public void setAirCond(boolean airCond) {
        this.airCond = airCond;
    }

    public double calculateCombustion(){
        if (airCond){
            return getAvgCombustion() + 0.8;
        }else {
            return getAvgCombustion();
        }
    }

    public double calculateRange(double actualCombustion){
        System.out.println("tank " + getTankVolume() + " , spalanie " + actualCombustion);
        return (getTankVolume() * 100) / (actualCombustion);
    }

    public void showRange(double range){
        System.out.println("Zasięg " + range);
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
