public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AppMediator();
        Colleague mobile = new MobileColleague(mediator);
        Colleague desktop = new DesktopColleague(mediator);
        System.out.println("Mobile sents to desktop");
        mobile.sendToMediator("Hello!!!!");
        System.out.println("Desktop recieves and Replies");
        desktop.sendToMediator("Hieeeeee!!!");
    }
}
