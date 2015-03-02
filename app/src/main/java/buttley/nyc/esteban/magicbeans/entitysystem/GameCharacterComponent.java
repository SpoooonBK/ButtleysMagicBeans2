package buttley.nyc.esteban.magicbeans.entitysystem;

import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;

/**
 * Created by Tara on 3/1/2015.
 */
public class GameCharacterComponent extends Component{
    CharacterNamesEnum mName;
    CharacterType mCharacterType;

    public GameCharacterComponent(CharacterNamesEnum characterName, CharacterType characterType){
        mName = characterName;
        mCharacterType = characterType;
    }

}
