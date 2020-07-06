package carsWithACAndCombustion;

public class Vehicle {
    private String name;
    private int tankVolume;
    private double avgCombustion;

    public Vehicle(String name, int tankVolume, double avgCombustion) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.avgCombustion = avgCombustion;
    }

    public double getAvgCombustion() {
        return avgCombustion;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public String info(){
        return "Pojazd: " + name + ", pojemnosc baku: " + tankVolume + "l, śr spalanie: " + avgCombustion + "l/100km";
    }

    public void showInfo(){
        System.out.println(info());
    }

    public void setAirCond(boolean airCond) {
    }


    public double calculateRange(){
//        System.out.println("spalanie " + avgCombustion);
//        return (tankVolume * 100) / (avgCombustion);
        return 0;
    }
}
