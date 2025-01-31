// package Builder;

public class PhoneBuilder {
    Phone p;
    PhoneBuilder(){
        p = new Phone();
    }
    public PhoneBuilder setOS(String os){
        this.p.setOs(os);
        return this;
    }
    public PhoneBuilder setRAM(int ram){
        this.p.setRam(ram);
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize){
        this.p.setScreensize(screenSize);
        return this;
    }
    public Phone getgadget(){
        return this.p;
    }
}
