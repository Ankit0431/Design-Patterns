abstract class Colleague {
    protected Mediator mediator;
    public abstract void sendToMediator(String message);
    public abstract void recieveFromMediator(String message);
}
