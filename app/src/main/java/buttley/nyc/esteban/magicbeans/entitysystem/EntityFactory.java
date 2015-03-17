package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.entitysystem.components.AnimationComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.BackgroundComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.Component;
import buttley.nyc.esteban.magicbeans.entitysystem.components.ComponentType;
import buttley.nyc.esteban.magicbeans.entitysystem.components.GameCharacterComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.HoldEntityComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.PoopMeterComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.SoundComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.StaticGraphicsComponent;
import buttley.nyc.esteban.magicbeans.entitysystem.components.WidgetComponent;
import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.sounds.SoundMapBuilder;

/**
 * Created by Tara on 3/15/2015.
 */
public class EntityFactory {

    public Entity getEntity(WidgetTypeEnum widgetType){
        Map<ComponentType, Component> componentMap =
                new EnumMap<ComponentType, Component>(ComponentType.class);

        StaticGraphicsComponent staticGraphicsComponent =
                new StaticGraphicsComponent(Assets.getBitmap(widgetType));



        componentMap.put(ComponentType.WIDGET, new WidgetComponent(widgetType));
//        componentMap.put(ComponentType.STATIC_GRAPHICS, staticGraphicsComponent);

        switch (widgetType){
            case BACKGROUND:{
                componentMap.put(ComponentType.BACKGROUND, new BackgroundComponent());
                break;
            }

            case POOP_METER:{
                componentMap.put(ComponentType.POOP_METER, new PoopMeterComponent());
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

    public Entity getEntity(CharacterNamesEnum name){
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
