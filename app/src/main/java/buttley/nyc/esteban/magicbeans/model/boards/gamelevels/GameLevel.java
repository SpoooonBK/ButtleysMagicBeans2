package buttley.nyc.esteban.magicbeans.model.boards.gamelevels;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;


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
//        PoopMeterWidget poopMeter = (PoopMeterWidget) mEntityList.get(1);
//        int poopLevel = (25 + (mLevel * 5));
//        if(poopLevel < 100){
//            poopMeter.setmStartingPoopLevel(poopLevel);
//        }else {
//            poopMeter.setmStartingPoopLevel(99);
//        }
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
