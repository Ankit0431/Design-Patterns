public class Document {
    DocumentState state;
    public Document() {
        state = new EditState();
    }
    public void setState(DocumentState state) {
        this.state = state;
    }
    public DocumentState getState() {
        return state;
    }
    public void edit() {
        state.edit(this);
    }
    public void review() {
        state.review(this);
    }
    public void publish() {
        state.publish(this);
    }
}
