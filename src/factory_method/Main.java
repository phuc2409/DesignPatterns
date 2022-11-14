package factory_method;

public class Main {

    public static void main(String[] args) {
        ILaptop laptop = LaptopFactory.getLaptop(LaptopBrand.ASUS);
        System.out.println(laptop.getName());
    }
}
