// package Builder;

public class Phone {
    private int ram;
    private double screenSize;
    private String os;

    public Phone(int ram, int screenSize, String os){
        this.ram = ram;
        this.screenSize = screenSize;
        this.os = os;
    }
    public Phone(){}

    public void setRam(int ram){
        this.ram = ram;
    }
    public int getRam(){
        return this.ram;
    }
    public void setScreensize(double screenSize){
        this.screenSize = screenSize;
    }
    public double getScreensize(){
        return this.screenSize;
    }
    public void setOs(String os){
        this.os = os;
    }
    public String getOs(){
        return this.os;
    }

    public String toString(){
        return "OS: "+ this.os +"\nRAM: "+ this.ram + " GB\nScreen size: " + this.screenSize + " in";
    }
}
