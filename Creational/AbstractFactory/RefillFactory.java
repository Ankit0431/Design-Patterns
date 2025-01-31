package AbstractFactory;

public class RefillFactory {
    static Refill getRefill(String type) {
        switch (type) {
            case "gel":
                return new Gel();
            case "sponge":
                return new Sponge();
            default:
                return null;
        }
    }
}
