package oop.car_1_1;

public class Car {

    private String model;
    private String make;
    private int year;
    private String color;

    public Car(String model, String make, int year, String color) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
