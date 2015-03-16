package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.sounds.SoundMapBuilder;

/**
 * Created by Tara on 3/15/2015.
 */
public class EntityFactory {

    public static Entity getEntity(WidgetTypeEnum widgetType){
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

    public static Entity getEntity(CharacterNamesEnum name){
        Map<ComponentType, Component> componentMap =
                new EnumMap<ComponentType, Component>(ComponentType.class);

        GameCharacterComponent gameCharacterComponent =
                new GameCharacterComponent(name, name.getCharacterType());
        StaticGraphicsComponent staticGraphicsComponent =
                new StaticGraphicsComponent(Assets.getBitmap(name));
        AnimationComponent animationComponent=
                new AnimationComponent(Assets.getSprite(name));
        SoundComponent soundComponent =
                new SoundComponent(SoundMapBuilder.buildSoundList(name));


        componentMap.put(ComponentType.CHARACTER, gameCharacterComponent);
        componentMap.put(ComponentType.STATIC_GRAPHICS, staticGraphicsComponent);
        componentMap.put(ComponentType.ANIMATION, animationComponent);
        componentMap.put(ComponentType.SOUND, soundComponent);


        switch (name){
            case BUTTLEY:{
                componentMap.put(ComponentType.HOLD_ENTITY, new HoldEntityComponent());
            }
        }

        return new Entity(componentMap);
    }
}
