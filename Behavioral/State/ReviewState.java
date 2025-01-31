public class ReviewState implements DocumentState {
    public void edit(Document document){
        System.out.println("Document cannot be edited when in review state");
    }
    public void review(Document document){
        System.out.println("Already in review state");
    }
    public void publish(Document document){
        System.out.println("Sending document for publishing");
        document.setState(new PublishState());
    }
}
