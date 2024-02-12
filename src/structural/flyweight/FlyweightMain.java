package structural.flyweight;

import java.util.Random;

import structural.flyweight.meteor.MeteorSpawner;
import structural.flyweight.meteor.MeteorTypeFactory;
import structural.flyweight.meteor.MovementDirection;

public class FlyweightMain {

    public static void main(String[] args) {
        MeteorSpawner meteorSpawner = new MeteorSpawner();

        long meteorsToSpawnNumber = 3_000_000;
        long meteorsToSpawnTypes = 3;

        long countSpawnedMeteors = 0;
        for (int i = 0; i < meteorsToSpawnNumber / meteorsToSpawnTypes; i++) {

            // SPAWN SMALL METEOR
            meteorSpawner.spawnMeteor(
                    randomLong(),
                    randomLong(),
                    MovementDirection.SOUTH,
                    randomInt(),
                    "/assets/meteor/sprites/small.png", // SMALL METEOR
                    "/assets/meteor/animations/default.anim",
                    "/assets/meteor/animations/explode.anim"
            );
            countSpawnedMeteors++;

            // SPAWN MEDIUM METEOR
            meteorSpawner.spawnMeteor(
                    randomLong(),
                    randomLong(),
                    MovementDirection.SOUTH,
                    randomInt(),
                    "/assets/meteor/sprites/medium.png", // MEDIUM METEOR
                    "/assets/meteor/animations/default.anim",
                    "/assets/meteor/animations/explode.anim"
            );
            countSpawnedMeteors++;

            // SPAWN BIG METEOR
            meteorSpawner.spawnMeteor(
                    randomLong(),
                    randomLong(),
                    MovementDirection.SOUTH,
                    randomInt(),
                    "/assets/meteor/sprites/big.png", // BIG METEOR
                    "/assets/meteor/animations/default.anim",
                    "/assets/meteor/animations/explode.anim"
            );
            countSpawnedMeteors++;

        }

        System.out.println("----------");
        System.out.println("Spawned meteors: " + countSpawnedMeteors);
        System.out.println("Created meteors types: " + MeteorTypeFactory.totalMeteorTypes());
        System.out.println("-----------");
        System.out.printf("Even though we have %s Meteor object, we created only %s MeteorType objects. ",
                countSpawnedMeteors, MeteorTypeFactory.totalMeteorTypes());
        System.out.println("This will cause significant memory reduction. ");
        System.out.println("-----------");

    }

    private static long randomLong() {
        return new Random().nextLong();
    }

    private static int randomInt() {
        return new Random().nextInt();
    }


}
