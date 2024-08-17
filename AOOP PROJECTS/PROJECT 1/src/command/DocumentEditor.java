package command;



public class DocumentEditor {

    private Document document;

    public DocumentEditor(Document document) {
        this.document = document;
    }

    public void executeCommand(Command command) {
        command.execute(document);
    }

    public String display() {
        return document.display();
    }
}

