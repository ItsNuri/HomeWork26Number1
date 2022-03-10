package com.company;

public class Car {

    private int idOfCar;
    private String numberOfCar;

    public Car() {
    }

    public Car(int idOfCar, String numberOfCar) {
        this.idOfCar = idOfCar;
        this.numberOfCar = numberOfCar;
    }

    public int getIdOfCar() {
        return idOfCar;
    }

    public void setIdOfCar(int idOfCar) {
        this.idOfCar = idOfCar;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idOfCar=" + idOfCar +
                ", numberOfCar='" + numberOfCar + '\'' +
                '}';
    }
}
