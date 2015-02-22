package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.util.Log;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.BeanStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.ButtleyStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.PatientStageWidget;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterPool;

/**
 * Created by Tara on 1/31/2015.
 */
public class WidgetPool {
    Map<WidgetTypeEnum, BoardWidget> mWidgetMap;

    public WidgetPool(CharacterPool characterPool) {
        mWidgetMap = new EnumMap<WidgetTypeEnum, BoardWidget>(WidgetTypeEnum.class);
        loadAllWidgets(characterPool);
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Widget Pool created");
        }
    }

    private void loadAllWidgets(CharacterPool characterPool) {
        mWidgetMap.put(WidgetTypeEnum.BACKGROUND, new BackgroundWidget());
        mWidgetMap.put(WidgetTypeEnum.TITLE, new TitleWidget());
        mWidgetMap.put(WidgetTypeEnum.BEAN_STAGE, new BeanStageWidget(characterPool));
        mWidgetMap.put(WidgetTypeEnum.POOP_METER, new PoopMeterWidget());
        mWidgetMap.put(WidgetTypeEnum.POWER_UP_BAR, new PowerUpBarWidget());
        mWidgetMap.put(WidgetTypeEnum.PATIENT_STAGE, new PatientStageWidget(characterPool));
        mWidgetMap.put(WidgetTypeEnum.BUTTLEY_STAGE, new ButtleyStageWidget());
        mWidgetMap.put(WidgetTypeEnum.SCORE_BOARD, new ScoreBoardWidget());
    }

    public BoardWidget getBoardWidget(WidgetTypeEnum widgetType){
        return mWidgetMap.get(widgetType);
    }

    public void setBoardWidget(WidgetTypeEnum widgetType, BoardWidget widget){
        mWidgetMap.put(widgetType, widget);
    }

}
