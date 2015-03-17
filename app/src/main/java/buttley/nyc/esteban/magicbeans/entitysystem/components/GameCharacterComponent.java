package buttley.nyc.esteban.magicbeans.entitysystem.components;

import buttley.nyc.esteban.magicbeans.entitysystem.components.Component;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;

/**
 * Created by Tara on 3/1/2015.
 */
public class GameCharacterComponent extends Component {
    CharacterNamesEnum mName;
    CharacterType mCharacterType;

    public GameCharacterComponent(CharacterNamesEnum characterName, CharacterType characterType){
        mName = characterName;
        mCharacterType = characterType;
    }

    public CharacterNamesEnum getName() {
        return mName;
    }

    public CharacterType getCharacterType() {
        return mCharacterType;
    }
}
