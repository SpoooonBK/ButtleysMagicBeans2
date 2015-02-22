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

    private PoopMeterWidget mPoopMeter;
    private BeanStageWidget mBeanStage;
    private ButtleyStageWidget mButtleyStage;
    private PowerUpBarWidget mPowerUpBar;
    private ScoreBoardWidget mScoreBoard;
    private BackgroundWidget mBackground;
    private PatientStageWidget mPatientStage;


    public GameLevel(WidgetPool widgetPool) {
        super(widgetPool);
        mBoardType = BoardTypeEnum.GAME_LEVEL;

        mPoopMeter = (PoopMeterWidget)widgetPool.getBoardWidget(WidgetTypeEnum.POOP_METER);
        mBackground = (BackgroundWidget)widgetPool.getBoardWidget(WidgetTypeEnum.BACKGROUND);
        mBeanStage = (BeanStageWidget)widgetPool.getBoardWidget(WidgetTypeEnum.BEAN_STAGE);
        mPowerUpBar = (PowerUpBarWidget)widgetPool.getBoardWidget(WidgetTypeEnum.POWER_UP_BAR);
        mPatientStage = (PatientStageWidget)widgetPool.getBoardWidget(WidgetTypeEnum.PATIENT_STAGE);
        mButtleyStage = (ButtleyStageWidget)widgetPool.getBoardWidget(WidgetTypeEnum.BUTTLEY_STAGE);
        mScoreBoard = (ScoreBoardWidget)widgetPool.getBoardWidget(WidgetTypeEnum.SCORE_BOARD);

        setLevel();
        setMode();
        setPoopMeterLevel();

    }

    @Override
    public void placeWidgets() {


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
        int poopLevel = (25 + (mLevel * 5));
        if(poopLevel < 100){
            mPoopMeter.setmStartingPoopLevel(poopLevel);
        }else {
            mPoopMeter.setmStartingPoopLevel(99);
        }
    }

    public void setMode(){
        mMode = GameMode.STANDARD;
    }


    @Override
    public void draw(Canvas canvas) {
        mBackground.draw(canvas);
        mPoopMeter.draw(canvas);
        mPatientStage.draw(canvas);
        mButtleyStage.draw(canvas);
        mPowerUpBar.draw(canvas);
        mScoreBoard.draw(canvas);
        mBeanStage.draw(canvas);
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
