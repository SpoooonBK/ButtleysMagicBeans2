package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class PoopMeterWidget extends BoardWidget {

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


    @Override
    public void setmBitmaps() {
        mBitmaps = Assets.getsWidgetBitmaps().get(WidgetTypeEnum.POOP_METER);
    }

    @Override
    public void placeWidget(Bitmap bitmap) {

    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void setStartingCoordinates() {

    }

    @Override
    public void setStartingCoordinates(int X, int Y) {

    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.POOP_METER;
    }
}
