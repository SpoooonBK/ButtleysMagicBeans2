package buttley.nyc.esteban.magicbeans.model.characters;

import android.util.Log;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.entitysystem.Entity;
import buttley.nyc.esteban.magicbeans.entitysystem.EntityFactory;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;

/**
 *
 */
public class CharacterPool {


    private Map<CharacterNamesEnum, Entity> mCharacterMap;
    private EntityFactory entityFactory;

    public CharacterPool(){
        mCharacterMap = new EnumMap<CharacterNamesEnum, Entity>(CharacterNamesEnum.class);
        entityFactory = new EntityFactory();
        loadAllCharacters();
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Character Pool created");
        }
    }

    public Map<CharacterNamesEnum, Entity> getmCharacterMap() {
        return mCharacterMap;
    }


    public Entity getGameCharacter(CharacterNamesEnum characterName){
        return mCharacterMap.get(characterName);
    }

    private void loadAllCharacters(){

        for(CharacterNamesEnum characterName: CharacterNamesEnum.values()){
            mCharacterMap.put(characterName, entityFactory.getEntity(characterName));
        }

    }


}
