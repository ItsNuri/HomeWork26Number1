package com.company;

public class CarsData {

    private String madeInYearOfCar;
    private String modelOfCar;
    private int priceOfCar;
    private String colorOfCar;

    public CarsData() {
    }

    public CarsData(String madeInYearOfCar, String modelOfCar, int priceOfCar, String colorOfCar) {
        this.madeInYearOfCar = madeInYearOfCar;
        this.modelOfCar = modelOfCar;
        this.priceOfCar = priceOfCar;
        this.colorOfCar = colorOfCar;
    }

    public String getMadeInYearOfCar() {
        return madeInYearOfCar;
    }

    public void setMadeInYearOfCar(String madeInYearOfCar) {
        this.madeInYearOfCar = madeInYearOfCar;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public int getPriceOfCar() {
        return priceOfCar;
    }

    public void setPriceOfCar(int priceOfCar) {
        this.priceOfCar = priceOfCar;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    @Override
    public String toString() {
        return "CarsData{" +
                "madeInYearOfCar='" + madeInYearOfCar + '\'' +
                ", modelOfCar='" + modelOfCar + '\'' +
                ", priceOfCar=" + priceOfCar +
                ", colorOfCar='" + colorOfCar + '\'' +
                '}';
    }
}
