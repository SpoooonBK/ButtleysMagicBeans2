package buttley.nyc.esteban.magicbeans.main;

import buttley.nyc.esteban.magicbeans.model.boards.widgets.BoardWidget;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.stages.ButtleyStageWidget;

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

    }



    private void setAspectRatio() {
    }

    public enum AspectRatio{}

    public static void placeWidget(BoardWidget widget){
            WidgetTypeEnum widgetType =widget.getWidgetType();

           switch(widgetType){

           }




    }

}
