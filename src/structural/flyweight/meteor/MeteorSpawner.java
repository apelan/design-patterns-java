package structural.flyweight.meteor;

import java.util.ArrayList;
import java.util.List;

public class MeteorSpawner {
    private final List<Meteor> meteors = new ArrayList<>();

    public void spawnMeteor(
            long spawnPositionX,
            long spawnPositionY,
            MovementDirection movementDirection,
            int movementSpeed,
            String imageSprite,
            String animationDefault,
            String animationExplode
    ) {
        MeteorType meteorType = MeteorTypeFactory.getMeteorType(imageSprite, animationDefault, animationExplode);
        Meteor meteor = new Meteor(spawnPositionX, spawnPositionY, movementDirection, movementSpeed, meteorType);
        meteors.add(meteor);
    }


}
