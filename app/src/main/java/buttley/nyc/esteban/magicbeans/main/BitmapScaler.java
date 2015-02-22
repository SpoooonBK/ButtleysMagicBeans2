package buttley.nyc.esteban.magicbeans.main;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 * Created by Tara on 1/27/2015.
 */
public class BitmapScaler {



    private Matrix matrix;
    private Bitmap bitmap;

    public BitmapScaler(){
       matrix = new Matrix();

    }

    public Bitmap scaleBitmap(Bitmap bitmap){

        int originalHeight = bitmap.getHeight();
        int originalWidth = bitmap.getWidth();



        return bitmap;
    }
}
