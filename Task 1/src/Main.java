import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Phone phone1 = new Phone();
    Phone phone2 = new Phone("+347873743377","Xiaomi Redmi 3A",213.00);
    Phone phone3 = new Phone("+389020382932","Huawei X30",195.00);

    showInfo(phone1);
    showInfo(phone2);
    showInfo(phone3);
    phone3.receiveCall("John Johnson");
    phone2.receiveCall(phone2.model,phone2.number);
    updateInfo(phone1);
    showInfo(phone1);
    phone1.receiveCall("Papa","+39203020103");

    }
    //showInfo
    public static void showInfo(Phone phone) {
        System.out.println("Model: "+phone.model);
        System.out.println("Country: "+Phone.manCountry);
        System.out.println("Weight: "+phone.weight);
        System.out.println("Number: "+phone.number);
    }
    //updateInfo
    public static void updateInfo(Phone phone) {
        System.out.println("Update info for "+phone.number);
        System.out.print("Model:");
        phone.model = new Scanner(System.in).next();
        System.out.print("Weight:");
        phone.weight = new Scanner(System.in).nextDouble();
        System.out.print("Number:");
        phone.number = new Scanner(System.in).next();
    }

}
