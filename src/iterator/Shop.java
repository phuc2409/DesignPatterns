package iterator;

import java.util.ArrayList;

public class Shop {

    private final ArrayList<Laptop> laptops = new ArrayList<>();

    public void addItem(Laptop laptop) {
        laptops.add(laptop);
    }

    public LaptopItemIterator iterator() {
        return new LaptopItemIterator();
    }

    class LaptopItemIterator implements Iterator<Laptop> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < laptops.size();
        }

        @Override
        public Laptop next() {
            Laptop laptop =  laptops.get(currentIndex);
            currentIndex++;
            return laptop;
        }
    }
}
