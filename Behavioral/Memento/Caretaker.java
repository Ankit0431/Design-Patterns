import java.util.*;

public class Caretaker {
    private ArrayList<Memento> mementos;
    
    public Caretaker() {
        mementos = new ArrayList<Memento>();
    }
    
    public void addMemento(Memento memento) {
        mementos.add(memento);
    }
    
    public Memento getMemento() {
       Memento memento = mementos.get(mementos.size()-1);
       mementos.remove(mementos.size()-1);
       System.out.println(mementos);
       System.out.println(mementos.size());
       return memento;
    }
    
}