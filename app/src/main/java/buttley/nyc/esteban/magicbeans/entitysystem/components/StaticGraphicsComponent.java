package buttley.nyc.esteban.magicbeans.entitysystem.components;

import android.graphics.Bitmap;

/**
 * Created by Tara on 3/1/2015.
 */
public class StaticGraphicsComponent extends Component {
    private Bitmap mSnapshot;
    private int mSnapshotHeight;
    private int mSnapshotWeight;

    StaticGraphicsComponent(Bitmap bitmap) {
        mSnapshot = bitmap;
        mSnapshotHeight = mSnapshot.getHeight();
        mSnapshotWeight = mSnapshot.getWidth();
    }

    public void draw(){

    }
}
