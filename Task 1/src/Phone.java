public class Phone {
    public static String manCountry = "CHINA";

    String number;
    String model;
    Double weight;

    public Phone() {

    }

    public Phone(String number, String model, Double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public void receiveCall (String caller) {
        System.out.println(this.number+" is now receiving call from" + caller);
    }

    public void receiveCall (String caller, String callerNumber) {
        System.out.println(this.number+" is now receiving call from" + caller +": "+callerNumber);
    }
}
