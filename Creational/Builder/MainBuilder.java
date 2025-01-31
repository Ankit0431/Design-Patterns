// package Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Phone p;
        
        PhoneBuilder b1 = new PhoneBuilder();
        p = b1.setOS("Android ").setRAM(12).setScreenSize(6.7).getgadget();
        System.out.println(p);
    }
}
