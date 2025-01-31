public class EditState implements DocumentState {
    public void edit(Document document){
        System.out.println("Editing");
    }
    public void review(Document document){
        System.out.println("Send document for review");
        document.setState(new ReviewState());
        
    }
    public void publish(Document document){
        System.out.println("Document cannot be published when in edit state");
    }
}
