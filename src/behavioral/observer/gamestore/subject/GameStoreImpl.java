package behavioral.observer.gamestore.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import behavioral.observer.gamestore.observer.EventType;
import behavioral.observer.gamestore.observer.User;

// Concrete Subject
public class GameStoreImpl implements GameStore {

    private final Map<EventType, List<User>> customers;

    public GameStoreImpl() {
        customers = new HashMap<>();
        for (EventType eventType : EventType.values()) {
            customers.put(eventType, new ArrayList<>());
        }
    }


    @Override
    public void subscribe(EventType eventType, User user) {
        customers.get(eventType).add(user);
    }

    @Override
    public void unsubscribe(EventType eventType, User user) {
        customers.get(eventType).remove(user);
    }

    @Override
    public void notify(EventType eventType, String message) {
        customers.get(eventType).forEach(customer -> customer.update(message));
    }
}
