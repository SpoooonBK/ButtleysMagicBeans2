package buttley.nyc.esteban.magicbeans.model.boards;

import android.graphics.Canvas;

import java.util.List;

import buttley.nyc.esteban.magicbeans.entitysystem.Entity;
import buttley.nyc.esteban.magicbeans.main.Renderer;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Board {

    protected BoardTypeEnum mBoardType;
    protected WidgetPool mWidgetPool;
    protected List<Entity> mEntityList;

    public Board(WidgetPool widgetPool){
        mWidgetPool = widgetPool;
    }

    public BoardTypeEnum getmBoardType() {
        return mBoardType;
    }

    public List<Entity> getmEntityList() {
        return mEntityList;
    }

    public void setmBoardType(BoardTypeEnum mBoardType) {
        this.mBoardType = mBoardType;
    }
//TODO SET WIDGET PLACEMENT
    public abstract void addAllWidgets();

    public void draw(Canvas canvas){
        for(Entity entity: mEntityList){
            Renderer.render(entity);
        }
    };



}


