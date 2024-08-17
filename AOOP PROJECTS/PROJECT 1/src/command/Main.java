package command;



public class Main {

    public static void main(String[] args) {
        // Create a document
        Document document = new Document("Hello World");

        // Create a document editor
        DocumentEditor editor = new DocumentEditor(document);

        // Create formatting commands
        Command boldCommand = new BoldCommand();
        Command italicCommand = new ItalicCommand();
        Command underlineCommand = new UnderlineCommand();

        // Apply the Bold command
        System.out.println("Applying Bold Command...");
        editor.executeCommand(boldCommand);
        System.out.println(editor.display());

        // Apply the Italic command
        System.out.println("Applying Italic Command...");
        editor.executeCommand(italicCommand);
        System.out.println(editor.display());

        // Apply the Underline command
        System.out.println("Applying Underline Command...");
        editor.executeCommand(underlineCommand);
        System.out.println(editor.display());

        // Display final result with all formatting applied
        System.out.println("Final Document Formatting:");
        System.out.println(editor.display());
    }
}
