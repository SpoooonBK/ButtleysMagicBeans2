package buttley.nyc.esteban.magicbeans.model.boards.widgets.stages;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterNamesEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterPool;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;
import buttley.nyc.esteban.magicbeans.model.characters.beans.Bean;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class BeanStageWidget extends BoardWidget implements CharacterStage {

    private Bean bean;
    private CharacterPool characterPool;

    public BeanStageWidget(CharacterPool characterPool) {
        this.characterPool = characterPool;
        setBean();

    }

    public void setBean() {
        bean = (Bean)characterPool.getGameCharacter(CharacterNamesEnum.BABY);
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

    @Override
    public void placeWidget(Bitmap bitmap) {

    }

    @Override
    public void draw(Canvas canvas) {
        bean.draw(canvas);
    }

    @Override
    public void setStartingCoordinates() {

    }

    @Override
    public void setStartingCoordinates(int x, int y) {

    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.BEAN_STAGE;
    }
}
