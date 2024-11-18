package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;



    public HybridCar(String description, String name, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description, name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }



    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return " Hybrid   car's engine is starting";
    }

    @Override
    public String drive (){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return " Hybrid   car's being drove";
    }

    @Override
    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return " Hybrid  car engine is running";
    }




}
