public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        
        o.setState("State 1");
        c.addMemento(o.save());
        
        o.setState("State 2");
        c.addMemento(o.save());

        o.setState("State 3");
        c.addMemento(o.save());

        o.restore(c.getMemento());
        o.restore(c.getMemento());
        
    }
}
