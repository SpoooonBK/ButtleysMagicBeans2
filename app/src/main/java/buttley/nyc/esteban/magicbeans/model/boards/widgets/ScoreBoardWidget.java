package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class ScoreBoardWidget extends BoardWidget {


    @Override
    public void setmBitmaps() {
        mBitmaps = Assets.getsWidgetBitmaps().get(WidgetTypeEnum.SCORE_BOARD);
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
        widgetType = WidgetTypeEnum.SCORE_BOARD;
    }
}
