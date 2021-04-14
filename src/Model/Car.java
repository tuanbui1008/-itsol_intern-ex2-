package Model;

import java.io.Serializable;

public class Car implements Serializable {
    private String carName;
    private String numberPlate;
    private int   yearOfManufacture;
    private String brand;
    private boolean haveInsurance;

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Car(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
        this.numberPlate = numberPlate;
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
        this.haveInsurance = haveInsurance;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isHaveInsurance() {
        return haveInsurance;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHaveInsurance(boolean haveInsurance) {
        this.haveInsurance = haveInsurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", brand='" + brand + '\'' +
                ", haveInsurance=" + haveInsurance +
                '}';
    }
}
