package buttley.nyc.esteban.magicbeans.entitysystem.components;

/**
 * Created by Tara on 3/15/2015.
 */
public class PositionComponent extends Component {
    private int mStartingXCoordinate;
    private int mStartingYCoordinate;
    private int mCurrentXCoordinate;
    private int mCurrentYCoordinate;

    public PositionComponent() {
    }

    public int getmStartingXCoordinate() {
        return mStartingXCoordinate;
    }

    public void setmStartingXCoordinate(int mStartingXCoordinate) {
        this.mStartingXCoordinate = mStartingXCoordinate;
    }

    public int getmStartingYCoordinate() {
        return mStartingYCoordinate;
    }

    public void setmStartingYCoordinate(int mStartingYCoordinate) {
        this.mStartingYCoordinate = mStartingYCoordinate;
    }

    public int getmCurrentXCoordinate() {
        return mCurrentXCoordinate;
    }

    public void setmCurrentXCoordinate(int mCurrentXCoordinate) {
        this.mCurrentXCoordinate = mCurrentXCoordinate;
    }

    public int getmCurrentYCoordinate() {
        return mCurrentYCoordinate;
    }

    public void setmCurrentYCoordinate(int mCurrentYCoordinate) {
        this.mCurrentYCoordinate = mCurrentYCoordinate;
    }


}
