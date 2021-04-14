package View;

import Control.CarControl;
import Control.InsuranceControl;
import Model.Insurance;

public class MainCar {
    public static void main(String[] args) {
        CarControl control = new CarControl();
//        InsuranceControl ic = new InsuranceControl();
//        ic.fakeDataInsurance();
//        ic.writeFile();
//        ic.readFileEmp();
//        control.fakeData();
//        control.writeFile();
//        control.readFileEmp();
        ShowCar showCar = new ShowCar();
        showCar.selectCar();
    }
}
