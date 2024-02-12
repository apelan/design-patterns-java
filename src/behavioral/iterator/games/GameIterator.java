package behavioral.iterator.games;

import java.util.Iterator;
import java.util.List;

public class GameIterator implements Iterator<Game> {

    private final List<Game> games;
    private int currentPosition;

    public GameIterator(List<Game> games) {
        this.games = games;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < games.size();
    }

    @Override
    public Game next() {
        if (hasNext()) {
            return games.get(currentPosition++);
        }

        return null;
    }
}
