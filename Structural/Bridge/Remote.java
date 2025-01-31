public abstract class Remote {
    private Tv imp;
    protected Remote(Tv tv) {
        this.imp = tv;
    }
    public void on(){
        imp.on();
    }
    public void off(){
        imp.off();
    }
    public void setChannel(int channel){
        imp.TuneChannel(channel);
    }
}
