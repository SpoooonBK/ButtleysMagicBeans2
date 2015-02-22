package buttley.nyc.esteban.magicbeans.model.boards.widgets.stages;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterPool;
import buttley.nyc.esteban.magicbeans.model.characters.GameCharacter;
import buttley.nyc.esteban.magicbeans.model.characters.patients.Patient;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class PatientStageWidget extends BoardWidget implements CharacterStage {

    private Patient patient;
    private CharacterPool characterPool;

    public PatientStageWidget(CharacterPool characterPool) {
        this.characterPool = characterPool;
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

    }

    @Override
    public void setStartingCoordinates() {

    }

    @Override
    public void setStartingCoordinates(int X, int Y) {

    }

    @Override
    public void setWidgetType() {
        widgetType = WidgetTypeEnum.PATIENT_STAGE;
    }
}
