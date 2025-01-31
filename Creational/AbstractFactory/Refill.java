package AbstractFactory;

public abstract class Refill {
    abstract String getRefill();
}

class Gel extends Refill{
    @Override
    String getRefill() {
        return "Gel refill created";
    }
}

class Sponge extends Refill{
    @Override
    String getRefill() {
        return "Sponge tube created";
    }
}
