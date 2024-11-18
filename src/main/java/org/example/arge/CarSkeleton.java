package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return " the car's engine is starting";
    }

    public String drive (){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return " the car's being drove";
    }

    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return " the car engine is running";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
