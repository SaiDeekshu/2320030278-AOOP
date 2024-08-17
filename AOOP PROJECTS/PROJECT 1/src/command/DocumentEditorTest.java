package command;


import com.editor.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentEditorTest {

    private Document document;
    private DocumentEditor editor;

    @BeforeEach
    void setUp() {
        document = new Document("Hello World");
        editor = new DocumentEditor(document);
    }

    @Test
    void testBoldCommand() {
        Command bold = new BoldCommand();
        editor.executeCommand(bold);

        assertEquals("Bold", document.getFormatting().get(0));
        assertEquals("Bold: Hello World", editor.display());
    }

    @Test
    void testItalicCommand() {
        Command italic = new ItalicCommand();
        editor.executeCommand(italic);

        assertEquals("Italic", document.getFormatting().get(0));
        assertEquals("Italic: Hello World", editor.display());
    }

    @Test
    void testUnderlineCommand() {
        Command underline = new UnderlineCommand();
        editor.executeCommand(underline);

        assertEquals("Underline", document.getFormatting().get(0));
        assertEquals("Underline: Hello World", editor.display());
    }

    @Test
    void testMultipleCommands() {
        Command bold = new BoldCommand();
        Command italic = new ItalicCommand();
        Command underline = new UnderlineCommand();

        editor.executeCommand(bold);
        editor.executeCommand(italic);
        editor.executeCommand(underline);

        assertEquals(3, document.getFormatting().size());
        assertTrue(document.getFormatting().contains("Bold"));
        assertTrue(document.getFormatting().contains("Italic"));
        assertTrue(document.getFormatting().contains("Underline"));
        assertEquals("Bold, Italic, Underline: Hello World", editor.display());
    }
}
