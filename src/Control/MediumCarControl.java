package Control;

import Constants.ConvertDataType;
import Model.Car;
import Model.MediumCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediumCarControl {
    Scanner sc = new Scanner(System.in);
    ConvertDataType cdt = new ConvertDataType();

    public MediumCar inputMediumCar(int year,String carName) {
        MediumCar car = new MediumCar();
        car.setCarName(carName);
        car.setNumberPlate(String.valueOf(cdt.randomPlate()));
        car.setYearOfManufacture(year);
        car.setBrand(cdt.randomBrand());
        car.setHaveInsurance(cdt.ConvertStringtoBoolean());
        car.setHavePowerSteering(cdt.ConvertStringtoBoolean());
        return  car;
    }

}
