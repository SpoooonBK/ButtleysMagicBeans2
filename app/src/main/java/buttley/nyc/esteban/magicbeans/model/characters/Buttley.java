package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Canvas;
import android.util.Log;

import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.main.SoundNames;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Buttley extends GameCharacter {
    int mStartingXcoordinate;
    int mStartingYcoordinate;

    int characterSound;


    public Buttley(){
        setmSnapshot(Assets.sCharacterBitmaps.get(CharacterNamesEnum.BUTTLEY));
        characterSound = Assets.getsSoundMap().get(SoundNames.FART_1);
        setmCharacterType(CharacterType.BUTTLEY);

    }


    public int getmStartingXcoordinate() {
        return mStartingXcoordinate;
    }

    public void setmStartingXcoordinate(int mStartingXcoordinate) {
        this.mStartingXcoordinate = mStartingXcoordinate;
    }

    public int getmStartingYcoordinate() {
        return mStartingYcoordinate;
    }

    public void setmStartingYcoordinate(int mStartingYcoordinate) {
        this.mStartingYcoordinate = mStartingYcoordinate;
    }

    @Override
    public void draw(Canvas canvas) {

        canvas.drawBitmap(mSnapshot,mStartingXcoordinate,mStartingYcoordinate,null);

    }

    @Override
    public void animate() {

    }

    @Override
    public void playSound() {
        Assets.sSoundPool.play(characterSound,1,1,1,0,1);
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "buttley sound played");
        }
    }
}
