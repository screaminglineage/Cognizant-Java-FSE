public class ExcelDocumentFactory extends DocumentFactory {
    String contents;

    public ExcelDocumentFactory(String contents) {
        this.contents = contents;
    }

    public ExcelDocument createDocument() {
        return new ExcelDocument(contents);
    }
}
