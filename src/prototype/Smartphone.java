package prototype;

public class Smartphone implements Cloneable {

    private String name;
    private int storageCapacity;
    private int ram;
    private int batteryCapacity;
    private String language;

    public Smartphone(String name, int storageCapacity, int ram, int batteryCapacity, String language) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.ram = ram;
        this.batteryCapacity = batteryCapacity;
        this.language = language;
    }

    @Override
    protected Smartphone clone() {
        try {
            return (Smartphone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", ram=" + ram +
                ", batteryCapacity=" + batteryCapacity +
                ", language='" + language + '\'' +
                '}';
    }
}
