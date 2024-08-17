package command;



import java.util.ArrayList;
import java.util.List;

public class Document {
    private String text;
    private List<String> formatting;

    public Document(String text) {
        this.text = text;
        this.formatting = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public void applyFormatting(String format) {
        formatting.add(format);
    }

    public List<String> getFormatting() {
        return formatting;
    }

    public String display() {
        return String.join(", ", formatting) + ": " + text;
    }
}

