public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory("This is a Word file");
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.read();

        PdfDocumentFactory pdfFactory = new PdfDocumentFactory("This is a PDF file");
        PdfDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.read();
        pdfDoc.print();

        DocumentFactory excelFactory = new ExcelDocumentFactory("This is a Excel file");
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.read();
    }
}
