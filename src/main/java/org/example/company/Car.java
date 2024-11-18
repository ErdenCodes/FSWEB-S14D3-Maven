package org.example.company;

public class Car {
    private boolean engine ;
    private int cylinders;
    private String name;
    private int wheels ;

    public Car( int cylinders, String name ){
        this.cylinders= cylinders;
        this.name=name;
        this.wheels=4;
        this.engine= true;

    }



    public int getCylinders(){
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
         return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(cylinders);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
