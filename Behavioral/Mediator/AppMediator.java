import java.util.*;

public class AppMediator extends Mediator {
    protected ArrayList<Colleague> colleagues;

    public AppMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        System.out.println("Colleague Added");
    }

    public void send(String message, Colleague ignoreColleague) {
        for (Colleague colleague : colleagues) {
            if (colleague.equals(ignoreColleague)) {
                continue;
            }
            colleague.recieveFromMediator(message);
        }
    }

}
