package behavioral.iterator;

import java.util.Iterator;

import behavioral.iterator.games.Bundle;
import behavioral.iterator.games.Game;

public class IteratorMain {

    public static void main(String[] args) {

        Bundle bundle = new Bundle(
                new Game("GTA Vice City", 29.99),
                new Game("GTA San Andreas", 29.99),
                new Game("GTA IV", 39.99)
        );

        Iterator<Game> games = bundle.iterator();
        while (games.hasNext()) {
            System.out.println(games.next());
        }

    }

}
