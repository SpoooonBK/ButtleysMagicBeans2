package buttley.nyc.esteban.magicbeans.model.characters.beans;

import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.Sprite;

/**
 * Created by Spoooon on 1/20/2015.
 */
public class BabyBean extends Bean {


    public BabyBean(){
        mSprite = new Sprite((Assets.getBitmap(CharacterNamesEnum.BABY)),1, 16, 16);
    }



    @Override
    public void draw(Canvas canvas) {
        mSprite.draw(canvas, 0, 0);
    }

    @Override
    public void animate() {

    }

    @Override
    public void playSound() {

    }


}
