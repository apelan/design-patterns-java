package structural.markerInterface.logging;


// THIS REPRESENTS CLASS THAT IS TAGGED WITH MARKER INTERFACE
public class Service implements Loggable {


    @Override
    public String toString() {
        return "I'm loggable class!";
    }
}
