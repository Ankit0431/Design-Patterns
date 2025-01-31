public class DesktopColleague extends Colleague{
    DesktopColleague(Mediator mediator){
        this.mediator = mediator;
        mediator.addColleague(this);
    }
    public void sendToMediator(String message){
        mediator.send(message, this);
    }
    public void recieveFromMediator(String message){
        System.out.println("Message in Desktop Colleague");
        System.out.println(message);
    }
    
}
