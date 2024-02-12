package behavioral.iterator.games;

import java.util.Iterator;
import java.util.List;

public class Bundle implements GameCollection {

    private List<Game> games;

    public Bundle(Game... games) {
        this.games = List.of(games);
    }

    @Override
    public Iterator<Game> iterator() {
        return new GameIterator(games);
    }

}
