package buttley.nyc.esteban.magicbeans.model.boards;

import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class Board {

    protected BoardTypeEnum mBoardType;

    public Board(WidgetPool widgetPool){
    }

    public BoardTypeEnum getmBoardType() {
        return mBoardType;
    }

    public void setmBoardType(BoardTypeEnum mBoardType) {
        this.mBoardType = mBoardType;
    }
//TODO SET WIDGET PLACEMENT
    public abstract void placeWidgets();

    public abstract void draw(Canvas canvas);

}


