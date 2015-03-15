package buttley.nyc.esteban.magicbeans.entitysystem;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Map;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;

/**
 * Created by Tara on 3/15/2015.
 */
public class BackgroundComponent extends Component {
    private Map<BackgroundWidget.BackgroundNames, Bitmap> backgroundMap;
    private Bitmap mCurrentBackground;

    public BackgroundComponent() {
        backgroundMap = Assets.getsBackgroundBitmaps();
        mCurrentBackground = backgroundMap.get(BackgroundWidget.BackgroundNames.BATHROOM);
    }

    public void setBackground(BackgroundWidget.BackgroundNames background){
        mCurrentBackground= backgroundMap.get(background);
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(mCurrentBackground,0,0,null);
    }
}
