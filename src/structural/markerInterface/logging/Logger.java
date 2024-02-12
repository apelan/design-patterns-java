package structural.markerInterface.logging;

public class Logger {

    public void log(Object object) {
        if (object instanceof Loggable) {
            System.out.println("[LOG] " + object);
        }
    }

}
