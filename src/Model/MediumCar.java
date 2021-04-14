package Model;

import java.io.Serializable;
import java.util.Objects;

public class MediumCar extends Car implements Serializable {
    private boolean havePowerSteering;

    public MediumCar() {
    }

    public MediumCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
        super(numberPlate, yearOfManufacture, brand, haveInsurance);
    }

    public MediumCar(boolean havePowerSteering) {
        this.havePowerSteering = havePowerSteering;
    }

    public MediumCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance, boolean havePowerSteering) {
        super(numberPlate, yearOfManufacture, brand, haveInsurance);
        this.havePowerSteering = havePowerSteering;
    }

    public boolean isHavePowerSteering() {
        return havePowerSteering;
    }

    public void setHavePowerSteering(boolean havePowerSteering) {
        this.havePowerSteering = havePowerSteering;
    }

    @Override
    public String toString() {
        return "MediumCar{" +
                "havePowerSteering=" + havePowerSteering +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediumCar mediumCar = (MediumCar) o;
        return havePowerSteering == mediumCar.havePowerSteering;
    }

    @Override
    public int hashCode() {
        return Objects.hash(havePowerSteering);
    }
}
