public class Originator {
    private String state;

    public Originator() {
    }
    
    public Originator(String state) {
        this.state = state;
    }
    
    public Memento save(){
        System.out.println("Originator: Saving state to Menento");
        return new Memento(state);
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public void restore(Memento memento){
        System.out.println("Originator: Restoring state");
        state = memento.getState();
    }
}
