package factory_method;

public class LaptopFactory {

    private LaptopFactory() {
    }

    public static ILaptop getLaptop(LaptopBrand laptopBrand) {
        if (laptopBrand == LaptopBrand.ASUS) {
            return new AsusLaptop();
        }
        else if (laptopBrand == LaptopBrand.DELL) {
            return new DellLaptop();
        }
        else {
            throw new IllegalArgumentException("Hãng không hợp lệ");
        }
    }
}
