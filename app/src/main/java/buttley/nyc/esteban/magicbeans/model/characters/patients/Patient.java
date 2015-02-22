package buttley.nyc.esteban.magicbeans.model.characters.patients;

import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.characters.CharacterType;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Patient extends GameCharacter {

    private int startingPoopLevel;

    public Patient() {
       super();
       setmCharacterType(CharacterType.PATIENT);
    }


    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void animate() {

    }

    @Override
    public void playSound() {

    }
}
