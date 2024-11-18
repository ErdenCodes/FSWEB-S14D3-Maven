package org.example.arge;

public class ElectricCar extends  CarSkeleton{
   private double avgKmPerCharge;
   private int batterySize;



    public ElectricCar(String description, String name, double avgKmPerCharge, int batterySize) {
        super(description, name);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return " Electric  car's engine is starting";
    }

    @Override
    public String drive (){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return " Electric  car's being drove";
    }

@Override
    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return " Electric car engine is running";
    }


    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
}
