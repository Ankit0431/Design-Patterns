public class Main {
    public static void main(String[] args) {
        Controller c1 = new Controller(new Samsung());
        c1.on();
        c1.setNextChannel();
        c1.setNextChannel();
        c1.setPrevChannel();
        c1.setChannel(21);
        c1.setPrevChannel();
        c1.setPrevChannel();
        c1.setPrevChannel();
        c1.setPrevChannel();
        c1.setPrevChannel();
        c1.setPrevChannel();
        c1.setPrevChannel();
        c1.off();
    }
}
