package structural.markerInterface;

import structural.markerInterface.logging.Logger;
import structural.markerInterface.logging.Service;

public class MarkerInterfaceMain {

    public static void main(String[] args) {
        Logger logger = new Logger();

        Object doNotLogMe = new Object();
        logger.log(doNotLogMe); // Won't be logged

        Service service = new Service();
        logger.log(service); // Will be logged

    }

}
