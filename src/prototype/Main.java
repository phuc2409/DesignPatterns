package prototype;

public class Main {

    public static void main(String[] args) {
        Smartphone prototype = new Smartphone("Smartphone", 128, 4, 5000, "English");

        Smartphone vietnamSmartphone = prototype.clone();
        vietnamSmartphone.setLanguage("Việt Nam");

        Smartphone russiaSmartphone = prototype.clone();
        russiaSmartphone.setLanguage("Russian");

        System.out.println(prototype);
        System.out.println(vietnamSmartphone);
        System.out.println(russiaSmartphone);
    }
}
