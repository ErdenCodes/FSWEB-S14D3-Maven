package org.example.arge;



public class GasPoweredCar extends  CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;



    public GasPoweredCar(String description, String name, double averageKmPerLiter, int cylinders) {
        super(description, name);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return " GasPowered  car's engine is starting";
    }

    @Override
    public String drive (){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return " GasPowered  car's being drove";
    }

    @Override
    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return " GasPowered  car engine is running";
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
