package Constants;


import java.util.Random;
import java.util.Scanner;

public class ConvertDataType {
    Scanner sc = new Scanner(System.in);

    public boolean ConvertStringtoBoolean(){
        return new Random().nextBoolean();
    }
    public int convertStringtoInt() {
        boolean flag = true;
        int result = 0;
        while (flag) {
            try {
                result = new Random().nextInt(1000);
                flag = false;
            } catch (Exception e) {
                flag = true;
                System.out.println("Du lieu khong dung xin nhap lai !");
            }
        }
        return result;
    }

    public float convertStringtoFloat() {
        boolean flag = true;
        float result = 0;
        while (flag) {
            try {
                result = Float.parseFloat(sc.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Du lieu khong dung xin nhap lai !");
            }
        }
        return result;
    }

    public int randomPlate() {
        Random random = new Random();
        int max = 99999;
        int min = 10000;
        int result = 0;
        do {
            result = random.nextInt((max - min + 1) + min);
        } while (result < min);
        return result;
    }

    public int randomYear() {
        Random random = new Random();
        int max = 2012;
        int min = 1980;
        int result = 0;
        do {
            result = random.nextInt((max - min + 1) + min);
        } while (result < min);
        return result;
    }

    public String randomBrand(){
        String[] Brand = {"Toyota", "BMW", "Hyundai"};
        final int maxAddress = Brand.length - 1;
        final int minAddress = 0;
        int number = new Random().nextInt((maxAddress-minAddress + 1) +minAddress);
        String result = Brand[number];
        return result;
    }public String randomType(){
        String[] Brand = {"A", "B", "C"};
        final int maxAddress = Brand.length - 1;
        final int minAddress = 0;
        int number = new Random().nextInt((maxAddress-minAddress + 1) +minAddress);
        String result = Brand[number];
        return result;
    }
}


