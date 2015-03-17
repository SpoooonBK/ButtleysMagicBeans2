package buttley.nyc.esteban.magicbeans.model.characters;

import android.util.Log;

import buttley.nyc.esteban.magicbeans.entitysystem.components.Component;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.main.Assets;


/**
 * Created by Spoooon on 1/18/2015.
 */
public class Buttley extends Component {
    int mStartingXcoordinate;
    int mStartingYcoordinate;

    int mCurrentXcoordinate;
    int mCurrentYCoordinate;

    private int mTrayTop;
    private int mTrayBottom;
    private int mTrayLeft;
    private int mTrayRight;
    private int mTrayMidX;
    private int mTrayMidY;

    int characterSound;



//    public Buttley(){
//        setmSnapshot(Assets.sCharacterBitmaps.get(CharacterNamesEnum.BUTTLEY));
//        characterSound = Assets.getsSoundMap().get(SoundNamesEnum.FART_1);
//        setmCharacterType(CharacterType.BUTTLEY);
//
//        mTrayBottom = (int) (mSnapshotHeight * .75);
//        mTrayTop = (int) (mSnapshotHeight * .60);
//        mTrayLeft = (int) (mSnapshotWidth * .25);
//        mTrayRight = mSnapshotWidth;
//        mTrayMidX = (int)(mTrayRight - mTrayLeft)/2;
//        mTrayMidY = (int)(mTrayBottom - mTrayTop)/2;
//
//    }


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

    public void playSound() {
        Assets.sSoundPool.play(characterSound,1,1,1,0,1);
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "buttley sound played");
        }
    }

    private void setTrayCoordinates(){

    }
}
