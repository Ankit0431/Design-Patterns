package AbstractFactory;

public class TubeFactory {
    
    static Tube getTube(String type) {
        switch (type) {
            case "metal":
                return new Metal();
            case "plastic":
                return new Plastic();
            default:
                return null;
        }
    }
}
