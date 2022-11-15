package memento;

public class Originator {

    private int x;
    private int y;

    public Originator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Memento save() {
        return new Memento(this.x, this.y);
    }

    public void undo(Memento mem) {
        this.x = mem.getX();
        this.y = mem.getY();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
