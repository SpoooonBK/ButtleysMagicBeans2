package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

/**
 * Created by Tara on 3/15/2015.
 */
public class EntityFactory {

    public static Entity getWidget(WidgetTypeEnum widgetType){
        Map<ComponentType, Component> componentMap =
                new EnumMap<ComponentType, Component>(ComponentType.class);


        componentMap.put(ComponentType.WIDGET, new WidgetComponent(widgetType));

        switch (widgetType){
            case BACKGROUND:{
                componentMap.put(ComponentType.BACKGROUND, new BackgroundComponent());
                break;
            }

            case POOP_METER:{
                break;
            }

            case POWER_UP_BAR:{
                break;
            }

            case TITLE:{
                break;
            }

            case SCORE_BOARD:{
                break;
            }
        }
        return new Entity(componentMap);
    }

    public static Entity getCharacter(CharacterNamesEnum name){
        Map<ComponentType, Component> componentMap =
                new EnumMap<ComponentType, Component>(ComponentType.class);



        return new Entity(componentMap);
    }
}
