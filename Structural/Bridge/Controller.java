public class Controller extends  Remote{
    private int channel;
    public Controller(Tv tv) {
        super(tv);
        this.channel = 1;
    }
    public void setNextChannel(){
        channel+=1;
        super.setChannel(channel);
    }
    public void setPrevChannel(){
        channel-=1;
        super.setChannel(channel);
    }
    @Override
    public void setChannel(int channel){
        super.setChannel(channel);
        this.channel = channel;
    }
}
