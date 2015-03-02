package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.List;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;

/**
 * Created by Tara on 3/1/2015.
 */
public class Entity {
    int id;
    Map<CharacterType, Component> mComponentList;

    public Entity(Map<?,?> componentMap) {
        this.mComponentList = mComponentList;
    }
}
