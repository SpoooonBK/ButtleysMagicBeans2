package buttley.nyc.esteban.magicbeans.entitysystem.components;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.sounds.Sound;

/**
 * Created by Tara on 3/1/2015.
 */
public class SoundComponent extends Component {

    List<Sound> mSounds;


    public SoundComponent(List<Sound> sounds) {
        mSounds = sounds;
    }

    public void playSound(){

    }
}
