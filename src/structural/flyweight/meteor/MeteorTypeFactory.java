package structural.flyweight.meteor;


import java.util.HashMap;
import java.util.Map;

// FLYWEIGHT FACTORY (RETURNS ALL POSSIBILITIES)
public class MeteorTypeFactory {
    private static final Map<String, MeteorType> meteorTypes = new HashMap<>();

    private MeteorTypeFactory() {}

    public static MeteorType getMeteorType(String imageSprite, String animationDefault, String animationExplode) {

        if (meteorTypes.get(imageSprite) == null) {
            meteorTypes.put(imageSprite, new MeteorType(imageSprite, animationDefault, animationExplode));
        }

        return meteorTypes.get(imageSprite);
    }

    public static long totalMeteorTypes() {
        return meteorTypes.size();
    }

}
