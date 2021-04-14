package View;

import Constants.ConvertDataType;
import Control.CarControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShowCar {
    CarControl car = new CarControl();
    Map<String, Object> mapOption = car.pickCar();
List<String> lstOption = new ArrayList<>();
    public void createMenuCar() {
        for (Map.Entry<String, Object> data : mapOption.entrySet()) {
            lstOption.add(data.getKey());
        }
    }

    public void showListCar() {
        createMenuCar();
        lstOption.forEach(s -> {
            System.out.println(s);
        });
    }

    public void selectCar() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int select = 0;
        showListCar();
        while (flag){
            System.out.println("Moi nhap lua chon:");
            try {
                select = sc.nextInt();
                if (select>=1 && select<=lstOption.size()){
                    flag=false;
                }else {
                    System.out.println("Nhap sai lua chon");
                }
            } catch (Exception e) {
                System.out.println("Nhap sai");
            }
        }
        String option = lstOption.get(select-1);
        mapOption.entrySet().forEach(s->{
            if (s.getKey().equalsIgnoreCase(option)){
                System.out.println(s.getValue().toString());
            }
        });

    }


}
