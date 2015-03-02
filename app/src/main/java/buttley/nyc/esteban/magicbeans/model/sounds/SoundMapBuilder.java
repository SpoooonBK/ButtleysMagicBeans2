package buttley.nyc.esteban.magicbeans.model.sounds;

import java.util.ArrayList;
import java.util.List;

import buttley.nyc.esteban.magicbeans.main.SoundNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

/**
 * Created by Tara on 3/1/2015.
 */
public class SoundMapBuilder {

    public static List<Sound> buildSoundList(CharacterNamesEnum characterNamesEnum) {
        List<Sound> soundList = new ArrayList<Sound>();

        switch (characterNamesEnum) {
            case BUTTLEY: {
                soundList.add(new Sound(SoundNamesEnum.FART_1));
                soundList.add(new Sound(SoundNamesEnum.FART_2));
            }
            break;
            case BABY: {
                soundList.add(new Sound(SoundNamesEnum.FART_3));
                soundList.add(new Sound(SoundNamesEnum.FART_4));
            }
            break;
        }
        return soundList;
    }
}
