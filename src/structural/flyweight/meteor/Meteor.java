package structural.flyweight.meteor;

public class Meteor {
    private final long spawnPositionX;

    private final long spawnPositionY;

    private final MovementDirection movementDirection;

    private final int movementSpeed;

    private final MeteorType type;

    public Meteor(long spawnPositionX, long spawnPositionY, MovementDirection movementDirection, int movementSpeed, MeteorType type) {
        this.spawnPositionX = spawnPositionX;
        this.spawnPositionY = spawnPositionY;
        this.movementDirection = movementDirection;
        this.movementSpeed = movementSpeed;
        this.type = type;
    }

    public long getSpawnPositionX() {
        return spawnPositionX;
    }

    public long getSpawnPositionY() {
        return spawnPositionY;
    }

    public MovementDirection getMovementDirection() {
        return movementDirection;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public MeteorType getType() {
        return type;
    }
}
