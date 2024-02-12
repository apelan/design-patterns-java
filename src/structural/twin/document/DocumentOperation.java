package structural.twin.document;

// SHARED BEHAVIOR FOR DOCUMENTS
public interface DocumentOperation {
    void save();
    void encrypt();
    void decrypt();
}
