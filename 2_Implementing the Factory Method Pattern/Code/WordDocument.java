public class WordDocument implements Document {
    String contents;

    public WordDocument(String contents) {
        this.contents = contents;
    }

    public void open() {
        System.out.println("Opening Word Document");
    }

    public void read() {
        System.out.println("Reading Word Document with data: " + "'"+contents+"'");
    }
}
