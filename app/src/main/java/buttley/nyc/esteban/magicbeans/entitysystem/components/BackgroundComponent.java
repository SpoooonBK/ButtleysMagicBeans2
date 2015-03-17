package buttley.nyc.esteban.magicbeans.entitysystem.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Map;

import buttley.nyc.esteban.magicbeans.main.Assets;
import buttley.nyc.esteban.magicbeans.model.boards.BackgroundNames;

/**
 * Created by Tara on 3/15/2015.
 */
public class BackgroundComponent extends Component {
    private Map<BackgroundNames, Bitmap> mBackgroundMap;
    private Bitmap mCurrentBackground;

    public BackgroundComponent() {
        mBackgroundMap = Assets.getBackgroundBitmaps();
        mCurrentBackground = mBackgroundMap.get(BackgroundNames.BATHROOM);
    }

    public void setBackground(BackgroundNames background){
        mCurrentBackground= mBackgroundMap.get(background);
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(mCurrentBackground,0,0,null);
    }
}
