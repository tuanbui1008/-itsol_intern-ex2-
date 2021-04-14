package Control;

import Constants.ConvertDataType;
import Model.Car;
import Model.ModernCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModernCarControl {
    Scanner sc = new Scanner(System.in);
    ConvertDataType cdt = new ConvertDataType();

    public ModernCar inputModernCar(int year,String carName) {
        ModernCar car = new ModernCar();
        car.setCarName(carName);
        car.setNumberPlate(String.valueOf(cdt.randomPlate()));
        car.setYearOfManufacture(year);
        car.setBrand(cdt.randomBrand());
        car.setHaveInsurance(cdt.ConvertStringtoBoolean());
        car.setHavePositiondevice(cdt.ConvertStringtoBoolean());
        return car;
    }
}
