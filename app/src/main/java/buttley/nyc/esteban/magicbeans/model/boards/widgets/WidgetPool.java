package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.util.Log;

import java.util.EnumMap;
import java.util.Map;

import buttley.nyc.esteban.magicbeans.entitysystem.Entity;
import buttley.nyc.esteban.magicbeans.entitysystem.EntityFactory;
import buttley.nyc.esteban.magicbeans.logging.LoggerConfig;

/**
 * Created by Tara on 1/31/2015.
 */
public class WidgetPool {
    private Map<WidgetTypeEnum, Entity> mWidgetMap;
    private EntityFactory entityFactory;

    public WidgetPool() {
        mWidgetMap = new EnumMap<WidgetTypeEnum, Entity>(WidgetTypeEnum.class);
        entityFactory = new EntityFactory();
        loadAllWidgets();
        if(LoggerConfig.ON){
            Log.v(LoggerConfig.LOG_TAG, "Widget Pool created");
        }
    }

    private void loadAllWidgets() {
        for(WidgetTypeEnum widgetType: WidgetTypeEnum.values()) {
            mWidgetMap.put(widgetType, entityFactory.getEntity(widgetType));
        }
    }

    public Entity getWidget(WidgetTypeEnum widgetType){
        return mWidgetMap.get(widgetType);
    }

}
