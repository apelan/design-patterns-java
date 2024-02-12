package structural.twin.document.version;

import structural.twin.document.ExcelDocument;

public class VersionableExcelDocument extends ExcelDocument implements Versionable {

    private int version = 1;

    @Override
    public void save() {
        super.save();
        version++;
    }

    @Override
    public int version() {
        return version;
    }
}
