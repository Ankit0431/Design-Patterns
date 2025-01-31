public class Samsung implements  Tv{
    @Override
    public void on(){
        System.out.println("Samsung Tv is ON");
    }
    @Override
    public void off(){
        System.out.println("Samsung Tv us Off");
    }
    @Override
    public void TuneChannel(int channel){
        System.out.println("Samsung Tv's Channel tuned to: " + channel);
    }
}
