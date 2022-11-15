package memento;

import java.util.HashMap;

public class CareTaker {

    private final HashMap<String, Memento> savePointStorage = new HashMap<>();

    public void saveMemento(Memento memento, String savedPointName) {
        System.out.println("Lưu " + savedPointName + ", " + memento);
        savePointStorage.put(savedPointName, memento);
    }

    public Memento getMemento(String savedPointName) {
        Memento memento = savePointStorage.get(savedPointName);
        System.out.println("Quay lại " + savedPointName + ", " + memento);
        return memento;
    }
}
