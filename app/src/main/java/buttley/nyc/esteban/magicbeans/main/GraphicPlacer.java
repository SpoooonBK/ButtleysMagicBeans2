package buttley.nyc.esteban.magicbeans.main;

import android.graphics.Bitmap;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BackgroundWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.PoopMeterWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.PowerUpBarWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.ScoreBoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.TitleWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.BeanStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.ButtleyStageWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.PatientStageWidget;
import buttley.nyc.esteban.magicbeans.model.characters.Buttley;
import buttley.nyc.esteban.magicbeans.model.characters.Sprite;
import buttley.nyc.esteban.magicbeans.model.characters.beans.Bean;

/**
 * Created by Spoooon on 1/24/2015.
 */
public class GraphicPlacer {

    public static int sScreenWidth;
    public static int sScreenHeight;



    GraphicPlacer(int width, int height){
        setsWidth(width);
       setsScreenHeight(height);
        setAspectRatio();
    }


    public static int getsWidth() {
        return sScreenWidth;
    }

    public static void setsWidth(int sWidth) {
        GraphicPlacer.sScreenWidth = sWidth;
    }

    public static int getsScreenHeight() {
        return sScreenHeight;
    }

    public static void setsScreenHeight(int sScreenHeight) {
        GraphicPlacer.sScreenHeight = sScreenHeight;
        //junk
    }



    private void setAspectRatio() {
    }

    public enum AspectRatio{}

    public static void setupBoard(List<BoardWidget> widgetList) {
        for (BoardWidget widget : widgetList) {
            WidgetTypeEnum widgetType = widget.getWidgetType();
            switch (widgetType) {

                case BEAN_STAGE: {
                    placeBeanStage((BeanStageWidget)widget);
                }
                    break;
                case PATIENT_STAGE: {
                    placePatientStage((PatientStageWidget)widget);
                }
                    break;
                case POOP_METER: {
                    placePoopMeter((PoopMeterWidget)widget);
                }
                    break;
                case POWER_UP_BAR: {
                    placePowerUpBar((PowerUpBarWidget)widget);
                }
                    break;
                case SCORE_BOARD: {
                    placeScoreBoard((ScoreBoardWidget)widget);
                }
                    break;
                case BACKGROUND: {
                    placeBackground((BackgroundWidget)widget);
                }
                    break;
                case TITLE: {
                    placeTitle((TitleWidget)widget);
                }
                    break;
                case BUTTLEY_STAGE: {
                    placeButtleyStage((ButtleyStageWidget)widget);
                }
                    break;
            }
        }
    }

    public static void placeButtleyStage(ButtleyStageWidget widget){

        int buttleyHeight = widget.getButtley().getmSnapshotHeight();

        int startingYCoordinate = GraphicPlacer.getsScreenHeight() - buttleyHeight;
        int startingXCoordinate = (int) GraphicPlacer.sScreenWidth/5;
        widget.setStartingCoordinates(startingXCoordinate, startingYCoordinate);
    }

    public static void placeBeanStage(BeanStageWidget widget){

    }

    public static void placePatientStage(PatientStageWidget widget){

    }

    public static void placePoopMeter(PoopMeterWidget widget){

    }

    public static void placePowerUpBar(PowerUpBarWidget widget){

    }

    public static void placeBackground(BackgroundWidget widget){

    }

    public static void placeTitle(TitleWidget widget){

    }

    public static void placeScoreBoard(ScoreBoardWidget widget){

    }

    public static void placeButtley(Buttley buttley, BoardTypeEnum boardType){
        int buttleyHeight = buttley.getmSnapshotHeight();

        int startingYCoordinate = GraphicPlacer.getsScreenHeight() - buttleyHeight;
        int startingXCoordinate = (int) GraphicPlacer.sScreenWidth/5;
        buttley.setmStartingXcoordinate(startingXCoordinate);
        buttley.setmStartingYcoordinate(startingYCoordinate);

    }

    public static void placeBean(Bean bean, BoardTypeEnum boardType){


    }

    public static void placeBean(Bean bean, Buttley buttley){

    }

    public static void placeButtleyHeld(Sprite sprite, Buttley buttley){

    }




}


