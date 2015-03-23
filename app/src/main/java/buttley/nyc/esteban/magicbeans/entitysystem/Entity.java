package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.Map;

import buttley.nyc.esteban.magicbeans.entitysystem.components.Component;
import buttley.nyc.esteban.magicbeans.entitysystem.components.ComponentType;

/**
 * Created by Tara on 3/1/2015.
 */
public class Entity {
    private int id;
    private Map<ComponentType, Component> mComponentList;

    public Entity(Map<ComponentType,Component> componentMap) {
        this.mComponentList = mComponentList;
    }

    public Map<ComponentType, Component> getmComponentList() {
        return mComponentList;
    }
}
