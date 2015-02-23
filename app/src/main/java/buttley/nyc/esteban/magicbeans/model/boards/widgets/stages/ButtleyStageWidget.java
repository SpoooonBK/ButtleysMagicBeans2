package buttley.nyc.esteban.magicbeans.model.boards.widgets.stages;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.main.GraphicPlacer;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.Buttley;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;

/**
 * Created by Spoooon on 1/22/2015.
 */
public class ButtleyStageWidget extends BoardWidget implements CharacterStage {

    Buttley buttley;

    public ButtleyStageWidget(){
       buttley = new Buttley();
       placeWidget(buttley.getmSnapshot());
    }

    public Buttley getButtley() {
        return buttley;
    }

    @Override
    public void placeWidget(Bitmap bitmap) {
        int buttleyHeight = bitmap.getHeight();
        int buttleyWidth = bitmap.getWidth();

        mYCoordinate = GraphicPlacer.getsScreenHeight() - buttleyHeight;
        mXCoordinate = (int) GraphicPlacer.sScreenWidth/5;

    }

    @Override
    public void draw(Canvas canvas) {
        buttley.draw(canvas);

    }

    @Override
    public void setStartingCoordinates() {

    }

    @Override
    public void setStartingCoordinates(int x, int y) {
        buttley.setmStartingXcoordinate(x);
        buttley.setmStartingYcoordinate(y);
    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.BUTTLEY_STAGE;
    }

    @Override
    public void enterStage(GameCharacter character) {

    }

    @Override
    public void exitStageRight(GameCharacter character) {

    }

    @Override
    public void exitStageLeft(GameCharacter character) {

    }
}
