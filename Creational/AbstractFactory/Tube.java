package AbstractFactory;

public abstract class Tube {
    abstract String getTube();
}

class Metal extends Tube{
    String type = "Metal";
    @Override
    String getTube() {
        return "Metal tube created";
    }
}

class Plastic extends Tube{
    String type = "Plastic";
    @Override
    String getTube() {
        return "Plastic tube created";
    }
}
