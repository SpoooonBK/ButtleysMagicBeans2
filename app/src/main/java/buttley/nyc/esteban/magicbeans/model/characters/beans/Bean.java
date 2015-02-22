package buttley.nyc.esteban.magicbeans.model.characters.beans;

import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Bean extends GameCharacter {

    Bean(){
        super();
        setmCharacterType(CharacterType.BEAN);
    }


    @Override
    public abstract void draw(Canvas canvas);

    @Override
    public abstract void animate();

    @Override
    public abstract void playSound();
}
