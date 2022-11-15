package memento;

public class Memento {

    private final int x;
    private final int y;

    public Memento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
