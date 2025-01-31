public class DisplayScreen implements Observer {
    public void update(float temperature) {
        System.out.println("The temperature in DisplayScreen is " + temperature);
    }
    
}
