package structural.twin.document;

public class TextDocument implements DocumentOperation {
    @Override
    public void save() {
        System.out.println("Saving TXT document...");
    }

    @Override
    public void encrypt() {
        System.out.println("Encrypting TXT document...");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypting TXT document...");
    }
}
