package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.List;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.entitysystem.components.Component;
import buttley.nyc.esteban.magicbeans.entitysystem.components.ComponentType;
import buttley.nyc.esteban.magicbeans.entitysystem.components.GameCharacterComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.HoldEntityComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.PositionComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.StaticGraphicsComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.WidgetComponent;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;


/**
 * Created by Tara on 3/22/2015.
 */
public class EntityPlacer {
    private int screenWidth;
    private int screenHeight;

    public EntityPlacer() {
        screenHeight = ScreenSize.sScreenHeight;
        screenWidth = ScreenSize.sScreenWidth;
    }

    public void placeEntity(Entity entity, BoardTypeEnum boardType){
        Map<ComponentType, Component> components = entity.getmComponentList();
        PositionComponent position = (PositionComponent) components.get(ComponentType.POSITION);


//        if(components.containsKey(ComponentType.HOLD_ENTITY)){
//            HoldEntityComponent holder = (HoldEntityComponent)components.get
//                    (ComponentType.HOLD_ENTITY);
//            Entity heldEntity
//        }

        if (components.containsKey(ComponentType.WIDGET)){
            WidgetComponent widget = (WidgetComponent)components.get(ComponentType.WIDGET);
            setWidgetPlacement(components, widget.getmWidgetType(),position);

        } else if (components.containsKey(ComponentType.CHARACTER)){
            setCharacterPlacement(components.get(ComponentType.CHARACTER), position);
        }

    }

    private void setWidgetPlacement
            (Map<ComponentType, Component> components,
             WidgetTypeEnum widgetTypeEnum, PositionComponent position) {
        switch (widgetTypeEnum){
            case BACKGROUND:{
                position.setmCurrentXCoordinate(0);
                position.setmCurrentYCoordinate(0);
                break;
            }
            case TITLE:{
                position.setmCurrentXCoordinate(screenWidth);
            }
        }
    }


}
