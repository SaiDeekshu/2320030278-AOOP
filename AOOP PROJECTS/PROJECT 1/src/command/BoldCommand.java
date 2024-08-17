package command;


public class BoldCommand implements Command {

    @Override
    public void execute(Document document) {
        document.applyFormatting("Bold");
    }
}

