public class PdfDocumentFactory extends DocumentFactory {
    String contents;

    public PdfDocumentFactory(String contents) {
        this.contents = contents;
    }

    public PdfDocument createDocument() {
        return new PdfDocument(contents);
    }
}
