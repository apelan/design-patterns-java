package structural.twin.document;

public class ExcelDocument implements DocumentOperation {
    @Override
    public void save() {
        System.out.println("Saving EXCEL document");
    }

    @Override
    public void encrypt() {
        System.out.println("Encrypting EXCEL document");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypting EXCEL document");
    }
}
