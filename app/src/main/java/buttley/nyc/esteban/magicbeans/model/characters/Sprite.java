package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by Tara on 2/16/2015.
 */
public class Sprite {
    private Bitmap mSpritesheet;
    private int mSheetColumns;
    private int mSheetRows;


    private int mFrameWidth;
    private int mFrameHeight;

    private Rect mSourceRect;

    private long mFrameTicker;
    private int mFramePeriod;
    private int mTotalFrames;
    private int mCurrentFrame;



    public Sprite(Bitmap spriteSheet, int sheetColumns, int sheetRows, int fps) {
        mSpritesheet = spriteSheet;
        mSheetColumns = sheetColumns;
        mSheetRows = sheetRows;
        mCurrentFrame = 0;

        mFrameWidth = (int)mSpritesheet.getWidth()/mSheetColumns;
        mFrameHeight =(int)mSpritesheet.getHeight()/mSheetRows;
        mTotalFrames =  mSheetColumns * mSheetRows;

        mFrameTicker = 1;
        mFramePeriod = 1000/fps;

        mSourceRect = new Rect(0,0, mFrameWidth, mFrameHeight);
    }

    public void update(long gameTime) {
        if (gameTime > mFrameTicker + mFramePeriod) {
            mFrameTicker = gameTime;
            // increment the frame
            mCurrentFrame++;
            if (mCurrentFrame >= mTotalFrames) {
                mCurrentFrame = 0;
            }
        }
        // define the rectangle to cut out sprite
        mSourceRect.top = mCurrentFrame * mFrameHeight;
        mSourceRect.bottom = mSourceRect.top + mFrameHeight;
    }

    public void draw(Canvas canvas, int xPlacement, int yPlacement){
            update(System.currentTimeMillis());
            Rect destRect = new Rect(xPlacement, yPlacement,
                    xPlacement + mFrameWidth,
                    yPlacement + mFrameHeight);
           canvas.drawBitmap(mSpritesheet, mSourceRect, destRect,null);
    }
}
