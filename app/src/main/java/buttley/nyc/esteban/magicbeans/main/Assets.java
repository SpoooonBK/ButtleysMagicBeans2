package buttley.nyc.esteban.magicbeans.main;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.model.boards.BackgroundNames;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.Sprite;

/**
 * Created by Spoooon on 1/23/2015.
 */
public class Assets {

    public static Map<WidgetTypeEnum, Bitmap> sWidgetBitmaps;
    private static Map<WidgetTypeEnum, Sprite> sWidgetSprites;

    public static Map<CharacterNamesEnum, Bitmap> sCharacterBitmaps;
    public static Map<CharacterNamesEnum, Sprite> sCharacterSpriteMap;

    public static Map<BackgroundNames, Bitmap> sBackgroundBitmaps;

    public static Map<SoundNamesEnum, Integer> sSoundMap;
    public static AudioManager sAudioManager;
    public static SoundPool sSoundPool;


    public Assets() {
        sWidgetBitmaps = new EnumMap<WidgetTypeEnum, Bitmap>(WidgetTypeEnum.class);
        sWidgetSprites = new EnumMap<WidgetTypeEnum, Sprite>(WidgetTypeEnum.class);

        sCharacterBitmaps = new EnumMap<CharacterNamesEnum, Bitmap>(CharacterNamesEnum.class);
        sCharacterSpriteMap = new EnumMap<CharacterNamesEnum, Sprite>(CharacterNamesEnum.class);

        sBackgroundBitmaps = new EnumMap<BackgroundNames, Bitmap>(BackgroundNames.class);

    }
    //Asset Loading Methods
    public static void loadAsset(CharacterNamesEnum name, Bitmap bitmap) {
        sCharacterBitmaps.put(name, bitmap);
    }

    public static void loadAsset(WidgetTypeEnum widgetType, Bitmap bitmap) {
        sWidgetBitmaps.put(widgetType, bitmap);
    }

    public static void loadAsset(CharacterNamesEnum name, Sprite sprite){
        sCharacterSpriteMap.put(name, sprite);
    }

    public static void loadAsset(WidgetTypeEnum widgetType, Sprite sprite){
        sWidgetSprites.put(widgetType, sprite);
    }

    public static void loadAsset(BackgroundNames backgroundName,Bitmap backgroundBitmap) {
        sBackgroundBitmaps.put(backgroundName,backgroundBitmap);
    }

    //Asset Retrieval Methods
    public static Bitmap getBitmap(CharacterNamesEnum characterName){
        return sCharacterBitmaps.get(characterName);
    }

    public static Bitmap getBitmap(WidgetTypeEnum widgetType){
        return sWidgetBitmaps.get(widgetType);
    }

    public static Bitmap getBitmap(BackgroundNames backgroundName){
        return sBackgroundBitmaps.get(backgroundName);
    }


    public static Sprite getSprite(CharacterNamesEnum characterName){
        return sCharacterSpriteMap.get(characterName);
    }



    public static Map<WidgetTypeEnum, Bitmap> getWidgetBitmaps() {
        return sWidgetBitmaps;
    }

    public static Map<CharacterNamesEnum, Bitmap> getCharacterBitmaps() {
        return sCharacterBitmaps;
    }

    public static Map<SoundNamesEnum, Integer> getsSoundMap() {
        return sSoundMap;
    }

    public static void setsSoundMap(Map<SoundNamesEnum, Integer> sSoundMap) {
        Assets.sSoundMap = sSoundMap;
    }

    public static Map<BackgroundNames, Bitmap> getBackgroundBitmaps() {
        return sBackgroundBitmaps;
    }

    public static AudioManager getAudioManager() {
        return sAudioManager;
    }

    public static void setsAudioManager(AudioManager sAudioManager) {
        Assets.sAudioManager = sAudioManager;
    }

    public static SoundPool     getSoundPool() {
        return sSoundPool;
    }

    public static void setsSoundPool(SoundPool sSoundPool) {
        Assets.sSoundPool = sSoundPool;
    }

    public static void loadSounds(AudioManager audioManager, SoundPool soundPool, Map<SoundNamesEnum, Integer> soundMap) {
        setsAudioManager(audioManager);
        setsSoundPool(soundPool);
        setsSoundMap(soundMap);
    }


}