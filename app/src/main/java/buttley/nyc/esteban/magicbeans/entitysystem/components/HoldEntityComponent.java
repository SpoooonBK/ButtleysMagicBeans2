package buttley.nyc.esteban.magicbeans.entitysystem.components;

import buttley.nyc.esteban.magicbeans.entitysystem.Entity;

/**
 * Created by Tara on 3/1/2015.
 */
public class HoldEntityComponent extends Component {
    Entity mEntity;

    public void holdEntity(Entity entity){
        mEntity = entity;

    }
}
