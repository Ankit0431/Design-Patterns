package Factory;

public class ShapeFactory {
    public Shape getShape(String shape) {
        switch (shape) {
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
