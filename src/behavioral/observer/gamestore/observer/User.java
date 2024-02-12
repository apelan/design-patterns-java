package behavioral.observer.gamestore.observer;

import java.util.Objects;

// Subscriber (Observer)
public abstract class User {

    protected final String email;

    protected User(String email) {
        this.email = email;
    }

    public abstract void update(String message);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
