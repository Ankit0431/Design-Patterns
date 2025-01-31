public class Sony implements Tv {
    @Override
    public void on(){
        System.out.println("Sony Tv is ON");
    }
    @Override
    public void off(){
        System.out.println("Sony Tv us Off");
    }
    @Override
    public void TuneChannel(int channel){
        System.out.println("Sony Tv's Channel tuned to: " + channel);
    }
}
