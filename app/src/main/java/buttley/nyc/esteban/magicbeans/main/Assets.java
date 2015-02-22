package buttley.nyc.esteban.magicbeans.main;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

/**
 * Created by Spoooon on 1/23/2015.
 */
public class Assets {

    public static Map<WidgetTypeEnum, List<Bitmap>> sWidgetBitmaps;
    public static Map<CharacterNamesEnum, Bitmap> sCharacterBitmaps;
    public static Map<SoundNames, Integer> sSoundMap;
    public static Map<BackgroundWidget.BackgroundNames, Bitmap> sBackgroundBitmaps;
    public static AudioManager sAudioManager;
    public static SoundPool sSoundPool;

    public Assets() {
        sWidgetBitmaps = new HashMap<WidgetTypeEnum, List<Bitmap>>();
        sCharacterBitmaps = new HashMap<CharacterNamesEnum, Bitmap>();
        sBackgroundBitmaps = new HashMap<BackgroundWidget.BackgroundNames, Bitmap>();

    }

    public static void loadAsset(CharacterNamesEnum name, Bitmap bitmap) {
        sCharacterBitmaps.put(name, bitmap);
    }

    public static void loadAsset(WidgetTypeEnum widgetType, List<Bitmap> bitmaps) {
        sWidgetBitmaps.put(widgetType, bitmaps);
    }

    public static void loadAsset(
            BackgroundWidget.BackgroundNames backgroundName,
            Bitmap backgroundBitmap) {
        sBackgroundBitmaps.put(backgroundName,backgroundBitmap);

    }

    public static Map<WidgetTypeEnum, List<Bitmap>> getsWidgetBitmaps() {
        return sWidgetBitmaps;
    }

    public static void setsWidgetBitmaps(Map<WidgetTypeEnum, List<Bitmap>> sWidgetBitmaps) {
        Assets.sWidgetBitmaps = sWidgetBitmaps;
    }

    public static Map<CharacterNamesEnum, Bitmap> getsCharacterBitmaps() {
        return sCharacterBitmaps;
    }

    public static void setsCharacterBitmaps(Map<CharacterNamesEnum, Bitmap> sCharacterBitmaps) {
        Assets.sCharacterBitmaps = sCharacterBitmaps;
    }

    public static Map<SoundNames, Integer> getsSoundMap() {
        return sSoundMap;
    }

    public static void setsSoundMap(Map<SoundNames, Integer> sSoundMap) {
        Assets.sSoundMap = sSoundMap;
    }

    public static Map<BackgroundWidget.BackgroundNames, Bitmap> getsBackgroundBitmaps() {
        return sBackgroundBitmaps;
    }

    public static void setsBackgroundBitmaps(Map<BackgroundWidget.BackgroundNames, Bitmap> sBackgroundBitmaps) {
        Assets.sBackgroundBitmaps = sBackgroundBitmaps;
    }

    public static AudioManager getsAudioManager() {
        return sAudioManager;
    }

    public static void setsAudioManager(AudioManager sAudioManager) {
        Assets.sAudioManager = sAudioManager;
    }

    public static SoundPool     getsSoundPool() {
        return sSoundPool;
    }

    public static void setsSoundPool(SoundPool sSoundPool) {
        Assets.sSoundPool = sSoundPool;
    }

    public static void loadSounds(AudioManager audioManager, SoundPool soundPool, Map<SoundNames, Integer> soundMap) {
        setsAudioManager(audioManager);
        setsSoundPool(soundPool);
        setsSoundMap(soundMap);
    }

    public static Bitmap getBitmap(CharacterNamesEnum characterName){
        return sCharacterBitmaps.get(characterName);
    }
}