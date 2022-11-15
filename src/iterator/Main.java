package iterator;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addItem(new Laptop("Asus", 20000000));
        shop.addItem(new Laptop("Dell", 15000000));
        shop.addItem(new Laptop("MSI", 18000000));

        Shop.LaptopItemIterator iterator = shop.iterator();
        while (iterator.hasNext()) {
            Laptop item = iterator.next();
            System.out.println(item);
        }
    }
}
