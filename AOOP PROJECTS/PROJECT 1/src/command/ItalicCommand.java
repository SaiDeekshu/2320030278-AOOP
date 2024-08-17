package command;



public class ItalicCommand implements Command {

    @Override
    public void execute(Document document) {
        document.applyFormatting("Italic");
    }
}

