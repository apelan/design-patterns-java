package behavioral.observer;

import behavioral.observer.gamestore.observer.EventType;
import behavioral.observer.gamestore.observer.GuestUser;
import behavioral.observer.gamestore.observer.PremiumUser;
import behavioral.observer.gamestore.subject.GameStore;
import behavioral.observer.gamestore.subject.GameStoreImpl;

public class ObserverMain {

    public static void main(String[] args) {
        GameStore gameStore = new GameStoreImpl();

        GuestUser guestUser = new GuestUser("guest@user.com");
        PremiumUser premiumUser = new PremiumUser("premium@user.com");

        System.out.println("---------");
        gameStore.subscribe(EventType.NEW_GAME, guestUser);
        gameStore.subscribe(EventType.NEW_GAME, premiumUser);
        gameStore.notify(EventType.NEW_GAME, "New game release!");
        System.out.println("---------");

        System.out.println("---------");
        gameStore.subscribe(EventType.GAME_ON_SALE, premiumUser);
        gameStore.notify(EventType.GAME_ON_SALE, "Game is now on sale!");
        System.out.println("---------");

    }

}
