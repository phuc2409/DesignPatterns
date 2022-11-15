package memento;

public class Main {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 10);

        originator.setX(6);
        careTaker.saveMemento(originator.save(), "Save 1");

        originator.setY(6);
        careTaker.saveMemento(originator.save(), "Save 2");

        originator.setX(10);
        careTaker.saveMemento(originator.save(), "Save 3");

        originator.setX(9);
        originator.setY(8);
        careTaker.saveMemento(originator.save(), "Save 4");

        originator.undo(careTaker.getMemento("Save 3"));
        System.out.println(originator);
    }
}
