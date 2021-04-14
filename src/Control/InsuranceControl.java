package Control;

import Constants.ConvertDataType;
import Model.Car;
import Model.Insurance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InsuranceControl {
    List<Insurance> lst = new ArrayList<>();

    public Insurance inputInsurance(String name) {
        Insurance isr = new Insurance();
        ConvertDataType cdt = new ConvertDataType();
        isr.setNameInsurance(name);
        isr.setInsuranceType(cdt.randomType());
        return isr;
    }

    public void fakeDataInsurance() {
        Insurance isr = new Insurance();
        for (int i = 0; i < 10; i++) {
            String name = "Insurance Package #" + i;
            lst.add(inputInsurance(name));
        }
        lst.forEach(s -> {
            System.out.println(s.toString());
        });
    }

    public void writeFile() {
        System.out.println("wirte-data");

        try {
            FileOutputStream fos = new FileOutputStream("Insurance.txt");
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

    public void readFileEmp() {
        lst.clear();
        try {
            FileInputStream fis = new FileInputStream("Insurance.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lst = (List<Insurance>) ois.readObject();
            ois.close();
            fis.close();
            showList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showList() {
        lst.forEach(s -> {
            System.out.println(s.toString());
        });
    }
}
