package behavioral.observer.gamestore.subject;

import behavioral.observer.gamestore.observer.EventType;
import behavioral.observer.gamestore.observer.User;

// Subject interface
public interface GameStore {

    void subscribe(EventType eventType, User user);
    void unsubscribe(EventType eventType, User user);
    void notify(EventType eventType, String message);

}
