package Model;

import java.io.Serializable;
import java.util.Objects;

public class ModernCar extends Car implements Serializable {
    private boolean havePositiondevice;

    public ModernCar() {
    }

    public ModernCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
        super(numberPlate, yearOfManufacture, brand, haveInsurance);
    }

    public ModernCar(boolean havePositiondevice) {
        this.havePositiondevice = havePositiondevice;
    }

    public ModernCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance, boolean havePositiondevice) {
        super(numberPlate, yearOfManufacture, brand, haveInsurance);
        this.havePositiondevice = havePositiondevice;
    }

    public boolean isHavePositiondevice() {
        return havePositiondevice;
    }

    public void setHavePositiondevice(boolean havePositiondevice) {
        this.havePositiondevice = havePositiondevice;
    }

    @Override
    public String toString() {
        return "ModernCar{" +
                "havePositiondevice=" + havePositiondevice +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModernCar modernCar = (ModernCar) o;
        return havePositiondevice == modernCar.havePositiondevice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(havePositiondevice);
    }
}
