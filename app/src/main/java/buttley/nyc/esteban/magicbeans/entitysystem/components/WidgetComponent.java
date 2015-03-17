package buttley.nyc.esteban.magicbeans.entitysystem.components;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;

/**
 * Created by Tara on 3/15/2015.
 */
public class WidgetComponent extends Component {
    private WidgetTypeEnum mWidgetType;

    public WidgetComponent(WidgetTypeEnum mWidgetType) {
        this.mWidgetType = mWidgetType;
    }

    public WidgetTypeEnum getmWidgetType() {
        return mWidgetType;
    }

    public void setmWidgetType(WidgetTypeEnum mWidgetType) {
        this.mWidgetType = mWidgetType;
    }
}
