package structural.twin.document.version;

import structural.twin.document.TextDocument;

public class VersionableTextDocument extends TextDocument implements Versionable {

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
