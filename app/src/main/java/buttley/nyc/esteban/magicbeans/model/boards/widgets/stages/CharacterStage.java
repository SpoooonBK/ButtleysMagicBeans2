package buttley.nyc.esteban.magicbeans.model.boards.widgets.stages;

import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;

/**
 * Created by Spoooon on 1/22/2015.
 */
public interface CharacterStage {


    public void enterStage(GameCharacter character);
    public void exitStageRight(GameCharacter character);
    public void exitStageLeft(GameCharacter character);
}
