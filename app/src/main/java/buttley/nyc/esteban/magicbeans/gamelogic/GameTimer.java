package buttley.nyc.esteban.magicbeans.gamelogic;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class GameTimer {

    private long startTime;
    private long endTime;
    private float elapsedTime;

    public void startTimer(){
        startTime =System.currentTimeMillis();
    }

    public void endTimer(){
        endTime=System.currentTimeMillis();
    }

    private void calculateElapsedTime(){
        elapsedTime = (endTime - startTime)/1000;
    }

    public float getTime(){
        return elapsedTime;
    }

}
