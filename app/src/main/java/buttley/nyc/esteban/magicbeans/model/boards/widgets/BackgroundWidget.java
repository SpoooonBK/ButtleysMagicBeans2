package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;

import java.util.Map;

import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.main.Assets;


/**
 * Created by Spoooon on 1/22/2015.
 */
public class BackgroundWidget extends BoardWidget {

    Map<BackgroundNames, Bitmap> mBackgroundMap;
    Bitmap background;

    public BackgroundWidget(){
        setmBackgroundMap();
    }

    public void setmBackgroundMap() {
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Setting Backgrounds");
        }
            mBackgroundMap = Assets.sBackgroundBitmaps;
    }

    @Override
    public void placeWidget(Bitmap bitmap) {
        mXCoordinate = 0;
        mYCoordinate = 0;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(mBackgroundMap.get(BackgroundNames.BATHROOM),0,0,null);
    }

    @Override
    public void setStartingCoordinates() {

    }

    @Override
    public void setStartingCoordinates(int x, int y) {

    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.BACKGROUND;
    }

    public enum BackgroundNames {
        BATHROOM
    }
}
