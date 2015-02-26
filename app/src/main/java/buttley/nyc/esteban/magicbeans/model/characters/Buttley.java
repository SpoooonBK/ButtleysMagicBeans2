package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;

import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.main.GraphicPlacer;
import buttley.nyc.esteban.magicbeans.main.SoundNames;
import buttley.nyc.esteban.magicbeans.model.characters.beans.Bean;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Buttley extends GameCharacter {
    int mStartingXcoordinate;
    int mStartingYcoordinate;

    int mCurrentXcoordinate;
    int mCurrentYCoordinate;

    int mTrayTop;
    int mTrayBottom;
    int mTrayLeft;
    int mTrayRight;
    int mTrayMidX;
    int mTrayMidY;

    int characterSound;



    public Buttley(){
        setmSnapshot(Assets.sCharacterBitmaps.get(CharacterNamesEnum.BUTTLEY));
        characterSound = Assets.getsSoundMap().get(SoundNames.FART_1);
        setmCharacterType(CharacterType.BUTTLEY);

        mTrayBottom = (int) (mSnapshotHeight * .75);
        mTrayTop = (int) (mSnapshotHeight * .60);
        mTrayLeft = (int) (mSnapshotWidth * .25);
        mTrayRight = mSnapshotWidth;
        mTrayMidX = (int)(mTrayRight - mTrayLeft)/2;
        mTrayMidY = (int)(mTrayBottom - mTrayTop)/2;

    }


    public int getmStartingXcoordinate() {
        return mStartingXcoordinate;
    }

    public void setmStartingXcoordinate(int mStartingXcoordinate) {
        this.mStartingXcoordinate = mStartingXcoordinate;
        mCurrentXcoordinate = mStartingXcoordinate;
    }

    public int getmStartingYcoordinate() {
        return mStartingYcoordinate;
    }

    public void setmStartingYcoordinate(int mStartingYcoordinate) {
        this.mStartingYcoordinate = mStartingYcoordinate;
        mCurrentYCoordinate = mStartingYcoordinate;
    }

    @Override
    public void draw(Canvas canvas) {

        canvas.drawBitmap(mSnapshot,mStartingXcoordinate,mStartingYcoordinate,null);

    }

    @Override
    public void animate() {

    }

    public void holdItem(Bean bean){
        Sprite sprite = bean.getmSprite();
        int beanHeight = sprite.getmFrameHeight();


    }

    public void holdItem(Sprite sprite){

    }

    public void holdItem(Bitmap bitmap){

    }

    public void tossItem(){

    }

    @Override
    public void playSound() {
        Assets.sSoundPool.play(characterSound,1,1,1,0,1);
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "buttley sound played");
        }
    }

    private void setTrayCoordinates(){

    }
}
