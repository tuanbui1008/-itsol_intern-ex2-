package Control;

import Constants.ConvertDataType;
import Model.Car;
import Model.MediumCar;
import Model.ModernCar;
import Model.OldCar;

import java.io.*;
import java.util.*;

public class CarControl {
    List<Car> lst = new ArrayList();
    MediumCarControl mdCar = new MediumCarControl();
    ModernCarControl modernCarControl = new ModernCarControl();
    OldCarControl OCar = new OldCarControl();


    public void fakeData() {
        System.out.println("fake-data");
        for (int i = 0; i < 10; i++) {

            Car car = new Car();
            String name = "Car #" + i;
            int year = new ConvertDataType().randomYear();
            if (year >= 2005) {
                car = modernCarControl.inputModernCar(year, name);
                lst.add(car);
            } else if (year <= 1995) {
                car = OCar.inputOldCar(year, name);
                lst.add(car);
            } else {
                car = mdCar.inputMediumCar(year, name);
                lst.add(car);
            }
        }
    }

    public void writeFile() {
        System.out.println("wirte-data");

        try {
            FileOutputStream fos = new FileOutputStream("Car.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lst);
            oos.close();
            fos.close();
            System.out.println("Success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        lst.clear();
        try {
            FileInputStream fis = new FileInputStream("Car.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lst = (List<Car>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showList() {
        lst.forEach(s -> {
            System.out.println(s.toString());
        });
    }

    public Map<String, Object> pickCar() {
        readFile();
        Map<String, Object> mapOption = new HashMap<>();
        for (int i = 0; i < lst.size(); i++) {
            String option = i + 1 + "." + lst.get(i).getCarName();
            mapOption.put(option, lst.get(i));
        }
        return mapOption;
    }

    public void showCar() {

    }
}
