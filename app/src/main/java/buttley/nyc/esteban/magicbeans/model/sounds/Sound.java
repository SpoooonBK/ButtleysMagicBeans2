package buttley.nyc.esteban.magicbeans.model.sounds;

import buttley.nyc.esteban.magicbeans.main.SoundNamesEnum;

/**
 * Created by Spoooon on 1/18/2015.
 */
public class Sound {

    SoundNamesEnum mSoundName;


    public Sound(SoundNamesEnum soundName) {
        mSoundName = soundName;
    }

    public SoundNamesEnum getSoundName() {
        return mSoundName;
    }
}
