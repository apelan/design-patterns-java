package behavioral.observer.gamestore.observer;

// Concrete Subscriber (Observer)
public class GuestUser extends User {
    public GuestUser(String email) {
        super(email);
    }

    @Override
    public void update(String message) {
        System.out.println(super.email + " is notified with message: '" + message + "'.");
    }
}
