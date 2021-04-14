package Control;

import Constants.ConvertDataType;
import Model.Car;
import Model.MediumCar;
import Model.OldCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OldCarControl {
    Scanner sc = new Scanner(System.in);
    ConvertDataType cdt = new ConvertDataType();

    public OldCar inputOldCar(int year,String carName){
        OldCar car = new OldCar();
        car.setCarName(carName);
        car.setNumberPlate(String.valueOf(cdt.randomPlate()));
        car.setYearOfManufacture(year);
        car.setBrand(cdt.randomBrand());
        car.setHaveInsurance(cdt.ConvertStringtoBoolean());
        car.setActionDuration(cdt.convertStringtoInt());
        return car;
    }
}
