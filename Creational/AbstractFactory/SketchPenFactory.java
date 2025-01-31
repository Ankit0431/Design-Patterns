package AbstractFactory;

public class SketchPenFactory {
    public static Pen getSketchPen(){
        System.out.println("Sketch pen here");
        return new Gel(RefillFactory.getRefill("sponge"), TubeFactory.getTube("plastic"));
    }
}
