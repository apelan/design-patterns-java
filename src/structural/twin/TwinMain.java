package structural.twin;

import structural.twin.document.version.VersionableTextDocument;

public class TwinMain {

    public static void main(String[] args) {

        VersionableTextDocument document = new VersionableTextDocument();
        System.out.println("PRE-SAVE VERSION: " + document.version());
        document.save();
        System.out.println("POST-SAVE VERSION: " + document.version());

        /*
        In this example Versionable interface represents additional functionality (besides DocumentOperation ones).

        Twin classes here are:
            - TextDocument and VersionableTextDocument
            - ExcelDocument and VersionableExcelDocument

        VersionableTextDocument and VersionableExcelDocument classes both extend their
        respective parents (TextDocument and ExcelDocument)and additionally implement the Versionable interface.
        This approach provides the illusion of achieving multiple inheritance,
        as these classes inherit both behavior from their parent classes
        and enhanced functionality through the interface.
         */

    }

}
