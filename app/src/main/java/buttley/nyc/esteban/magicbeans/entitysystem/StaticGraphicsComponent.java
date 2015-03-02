package buttley.nyc.esteban.magicbeans.entitysystem;

import android.graphics.Bitmap;

import buttley.nyc.esteban.magicbeans.model.characters.Sprite;

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
