package buttley.nyc.esteban.magicbeans.entitysystem;

import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.characters.Sprite;

/**
 * Created by Tara on 3/1/2015.
 */
public class AnimationComponent extends Component {
    Sprite mSprite;

    public AnimationComponent(Sprite sprite){
        mSprite = sprite;
    }

    public void draw(Canvas canvas){

    }
}
