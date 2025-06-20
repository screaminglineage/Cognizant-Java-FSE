public class WordDocumentFactory extends DocumentFactory {
    String contents;

    public WordDocumentFactory(String contents) {
        this.contents = contents;
    }

    public void open() {
        System.out.println("Opening Word Document");
    }

    public WordDocument createDocument() {
        return new WordDocument(contents);
    }
}
