package buttley.nyc.esteban.magicbeans.main;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.R;
import buttley.nyc.esteban.magicbeans.entitysystem.ScreenSize;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.model.boards.BackgroundNames;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;

public class MainActivity extends Activity {

    private Assets assets = new Assets();
    private AudioManager audioManager;
    public SoundPool soundPool;
    public static boolean assetsLoaded = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getScreenSize();
        loadSounds();
        loadAssets();
        setContentView(new buttley.nyc.esteban.magicbeans.main.MainGamePanel(this));


        if(LoggerConfig.ON) {
            Log.d(LoggerConfig.LOG_TAG, "View added");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    //    loads all assets into Assets class
    public void loadAssets(){
        loadWidgetBitmaps();
        loadCharacterBitmaps();
        loadBackgrounds();
        loadSounds();
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "assets loaded");
        }
        assetsLoaded = true;
    }

    public void loadSounds(){

        Map<SoundNamesEnum, Integer> soundMap =
                new HashMap<SoundNamesEnum, Integer>();

        audioManager = (AudioManager)getSystemService(AUDIO_SERVICE);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {

            }
        });

        soundMap.put(SoundNamesEnum.FART_1, soundPool.load(this, R.raw.sound1, 1));
        soundMap.put(SoundNamesEnum.FART_2, soundPool.load(this, R.raw.sound2, 1));
        soundMap.put(SoundNamesEnum.FART_3, soundPool.load(this, R.raw.sound3, 1));
        soundMap.put( SoundNamesEnum.FART_4, soundPool.load(this, R.raw.sound4, 1));

//Todo find out if I need to reference audioManager in Assets
        Assets.loadSounds(audioManager, soundPool, soundMap);
        if (LoggerConfig.ON) {
            Log.v(LoggerConfig.LOG_TAG, "sounds loaded");
        }
    }

    public void loadWidgetBitmaps(){



        for(WidgetTypeEnum widgetType: WidgetTypeEnum.values()){
            Assets.getWidgetBitmaps().put(widgetType,BitmapFactory.decodeResource(getResources(),
                    R.drawable.title_text));
        }
    }

    public void loadBackgrounds(){

        Bitmap bitmap;
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.background_9_16_bathroom);
        Assets.loadAsset(BackgroundNames.BATHROOM, bitmap);
    }

    public void loadCharacterBitmaps(){


        Assets.loadAsset(CharacterNamesEnum.BUTTLEY,
                BitmapFactory.decodeResource(getResources(), R.drawable.buttley_body_large));

       for(CharacterNamesEnum name: CharacterNamesEnum.values()){
           if(name != CharacterNamesEnum.BUTTLEY)
           Assets.loadAsset(name,
                   BitmapFactory.decodeResource(getResources(), R.drawable.baby_walking_sheet));
        }
    }

    public void getScreenSize(){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        ScreenSize.setsScreenWidth(size.x);
        ScreenSize.setsScreenHeight(size.y);

        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Screen size: Width: " + GraphicPlacer.getsWidth()
                    + " Height: " + GraphicPlacer.getsScreenHeight() );
        }

    }



}
