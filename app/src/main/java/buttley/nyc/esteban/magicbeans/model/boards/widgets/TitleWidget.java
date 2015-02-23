package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.main.GraphicPlacer;

/**
 * Created by Tara on 1/27/2015.
 */
public class TitleWidget extends BoardWidget {

    public TitleWidget (){
        setmBitmaps();
        placeWidget(getmBitmaps().get(0));
    }

    @Override
    public void setmBitmaps() {
       mBitmaps = Assets.getsWidgetBitmaps().get(WidgetTypeEnum.TITLE);
    }

    @Override
    public void placeWidget(Bitmap bitmap) {
        int bitmapWidth = bitmap.getWidth();
        int bitmapHeight= bitmap.getHeight();
        mXCoordinate = GraphicPlacer.getsWidth() - bitmapWidth;
        mYCoordinate = 0;
    }

    @Override
    public void draw(Canvas canvas) {
        for(Bitmap bitmap: mBitmaps){


            canvas.drawBitmap(bitmap, mXCoordinate, mYCoordinate, null);
        }

    }

    @Override
    public void setStartingCoordinates() {

    }

    @Override
    public void setStartingCoordinates(int x, int y) {

    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.TITLE;
    }
}
