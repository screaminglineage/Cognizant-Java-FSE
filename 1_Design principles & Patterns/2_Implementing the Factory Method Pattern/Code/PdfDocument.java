public class PdfDocument implements Document {
    String contents;

    public PdfDocument(String contents) {
        this.contents = contents;
    }

    public void open() {
        System.out.println("Opening PDF Document");
    }

    public void read() {
        System.out.println("Reading PDF Document with data: " + "'"+contents+"'");
    }

    public void print() {
        System.out.println("Printing PDF Document with data: " + "'"+contents+"'");
    }
}
