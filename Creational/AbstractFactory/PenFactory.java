package AbstractFactory;

public class PenFactory {

    PenFactory() {
    }
    Pen getPen(String type){
        switch (type) {
            case "gel":
                return GelPenFactory.getGelPen();
            case "sketch":
                return SketchPenFactory.getSketchPen();
            default:
                return null;
        }
    }
}
