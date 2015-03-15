package buttley.nyc.esteban.magicbeans.entitysystem;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;
import buttley.nyc.esteban.magicbeans.model.sounds.Sound;
import buttley.nyc.esteban.magicbeans.model.sounds.SoundMapBuilder;

/**
 * Created by Tara on 3/1/2015.
 */
public class EntityBuilder {

    public static Entity buildEntity(CharacterNamesEnum characterName){
        Map<ComponentType, Component> componentMap =
                new EnumMap<ComponentType, Component>(ComponentType.class);

        GameCharacterComponent gameCharacterComponent =
                new GameCharacterComponent(characterName, characterName.getCharacterType());
        StaticGraphicsComponent staticGraphicsComponent =
                new StaticGraphicsComponent(Assets.getBitmap(characterName));
        AnimationComponent animationComponent=
                new AnimationComponent(Assets.getSprite(characterName));
        SoundComponent soundComponent =
                new SoundComponent(SoundMapBuilder.buildSoundList(characterName));


        componentMap.put(ComponentType.CHARACTER, gameCharacterComponent);
        componentMap.put(ComponentType.STATIC_GRAPHICS, staticGraphicsComponent);
        componentMap.put(ComponentType.ANIMATION, animationComponent);
        componentMap.put(ComponentType.SOUND, soundComponent);



        switch (characterName){
            case BUTTLEY:{
                componentMap.put(ComponentType.HOLD_ENTITY, new HoldEntityComponent());
            }
        }

        return new Entity(componentMap);
    }
}
