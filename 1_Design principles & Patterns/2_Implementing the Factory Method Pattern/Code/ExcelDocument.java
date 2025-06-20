public class ExcelDocument implements Document {
    String contents;

    public ExcelDocument(String contents) {
        this.contents = contents;
    }

    public void open() {
        System.out.println("Opening Excel Document");
    }

    public void read() {
        System.out.println("Reading Excel Document with data: " + "'"+contents+"'");
    }
}
