package buttley.nyc.esteban.magicbeans.model.boards.gamelevels;

import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.PoopMeterWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.PowerUpBarWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.ScoreBoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.BeanStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.ButtleyStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.PatientStageWidget;


/**
 * Created by Spoooon on 1/18/2015.
 */
public class GameLevel extends Board {

    private int mLevel;
    private GameMode mMode;
    private boolean mIsInitializing = true;

    public GameLevel(WidgetPool widgetPool) {
        super(widgetPool);
        mBoardType = BoardTypeEnum.GAME_LEVEL;
        addAllWidgets();
        setLevel();
        setMode();
        setPoopMeterLevel();

    }

    @Override
    public void addAllWidgets() {
        mWidgetList.add((BackgroundWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.BACKGROUND));
        mWidgetList.add((PoopMeterWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.POOP_METER));
        mWidgetList.add((PatientStageWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.PATIENT_STAGE));
        mWidgetList.add((ButtleyStageWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.BUTTLEY_STAGE));
        mWidgetList.add((PowerUpBarWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.POWER_UP_BAR));
        mWidgetList.add((ScoreBoardWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.SCORE_BOARD));
        mWidgetList.add((BeanStageWidget)mWidgetPool.getBoardWidget(WidgetTypeEnum.BEAN_STAGE));

    }

    public int getLevel() {
        return mLevel;
    }

    public void setLevel() {

        if(mIsInitializing = true){
            mLevel = 1;
            mIsInitializing = false;
        } else{
          mLevel++;
        }
    }

    public void setPoopMeterLevel(){
        PoopMeterWidget poopMeter = (PoopMeterWidget)mWidgetList.get(1);
        int poopLevel = (25 + (mLevel * 5));
        if(poopLevel < 100){
            poopMeter.setmStartingPoopLevel(poopLevel);
        }else {
            poopMeter.setmStartingPoopLevel(99);
        }
    }

    public void setMode(){
        mMode = GameMode.STANDARD;
    }


    public enum GameMode {
        STANDARD, IRONBUTT, BLACKOUT;
    }

    public GameLevel getNextLevel(){
        setLevel();
        setPoopMeterLevel();
        return this;
    }


}
