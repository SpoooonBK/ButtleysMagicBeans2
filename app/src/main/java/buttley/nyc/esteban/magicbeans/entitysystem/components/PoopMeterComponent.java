package buttley.nyc.esteban.magicbeans.entitysystem.components;

import buttley.nyc.esteban.magicbeans.entitysystem.components.Component;

/**
 * Created by Tara on 3/16/2015.
 */
public class PoopMeterComponent extends Component {

    private final int mMAX_LEVEL = 100;
    private final int mMIN_LEVEL = 0;
    private int mStartingPoopLevel;
    private int mCurrentPoopLevel;

    public int getmStartingPoopLevel() {
        return mStartingPoopLevel;
    }

    public void setmStartingPoopLevel(int mStartingPoopLevel) {
        this.mStartingPoopLevel = mStartingPoopLevel;
    }

    public int getmCurrentPoopLevel() {
        return mCurrentPoopLevel;
    }

    public void setmCurrentPoopLevel(int mCurrentPoopLevel) {
        this.mCurrentPoopLevel = mCurrentPoopLevel;
    }

}
