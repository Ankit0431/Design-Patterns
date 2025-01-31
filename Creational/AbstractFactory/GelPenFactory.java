package AbstractFactory;

public class GelPenFactory{
    public static Pen getGelPen(){
        System.out.println("Gel pen here");
        return new Gel(RefillFactory.getRefill("gel"), TubeFactory.getTube("metal"));
    }
    
}
