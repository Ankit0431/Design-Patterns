public class PublishState implements DocumentState {
    public void edit(Document document){
        System.out.println("Document cannot be edited when in publish state");
    }
    public void review(Document document){
        System.out.println("Document cannot be reviewed when in publish state");
    }
    public void publish(Document document){
        System.out.println("Publishing document");
    }   
}
