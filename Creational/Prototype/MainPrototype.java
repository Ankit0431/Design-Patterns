public class MainPrototype {

    public static void main(String[] args) {
        Chess cp = new Chess("Prototype chess 1", 8, new String[] { "Black", "White" });
        Chess copycp;
        copycp = cp.getClone();
        System.out.println("OG one");
        cp.showDetails();
        System.out.println("Copy one");
        copycp.setName("Copy Prototype");
        copycp.showDetails();
    }

}
