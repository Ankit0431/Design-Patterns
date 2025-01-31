abstract class Mediator{ 
    public abstract void addColleague(Colleague colleague); 
    public abstract void send(String message, Colleague ignoreColleague);
}