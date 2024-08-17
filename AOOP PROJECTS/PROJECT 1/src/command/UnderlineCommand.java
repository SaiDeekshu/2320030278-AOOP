package command;



public class UnderlineCommand implements Command {

    @Override
    public void execute(Document document) {
        document.applyFormatting("Underline");
    }
}

