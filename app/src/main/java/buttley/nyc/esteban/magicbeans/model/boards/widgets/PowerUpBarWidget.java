package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class PowerUpBarWidget extends BoardWidget {


    @Override
    public void setmBitmaps() {
        mBitmaps = Assets.getsWidgetBitmaps().get(WidgetTypeEnum.POWER_UP_BAR);
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
    public void setStartingCoordinates(int x, int y) {

    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.POWER_UP_BAR;
    }
}
