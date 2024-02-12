package structural.flyweight.meteor;

// FLYWEIGHT OBJECT (COMMON PROPERTIES, IMMUTABLE)
public class MeteorType {

    private final String imageSprite;

    private final String animationDefault;

    private final String animationExplode;

    public MeteorType(String imageSprite, String animationDefault, String animationExplode) {
        this.imageSprite = imageSprite;
        this.animationDefault = animationDefault;
        this.animationExplode = animationExplode;
    }

    public String getImageSprite() {
        return imageSprite;
    }

    public String getAnimationDefault() {
        return animationDefault;
    }

    public String getAnimationExplode() {
        return animationExplode;
    }
}
