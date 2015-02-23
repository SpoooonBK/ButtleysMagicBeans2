package buttley.nyc.esteban.magicbeans.model.characters;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import buttley.nyc.esteban.magicbeans.model.boards.beanography.BeanographyPost;
import buttley.nyc.esteban.magicbeans.model.sounds.Sound;


/**
 * The base abstract GameCharacter class contains all the sounds and graphics for the characters
 */
public abstract class GameCharacter {

    protected Bitmap mSnapshot;
    protected int mSnapshotHeight;
    protected int mSnapshotWidth;
    protected List<AnimationDrawable> mAnimationsList;
    protected List<Sound> mSoundList;
    protected boolean mUnlocked;
    protected CharacterType mCharacterType;
    protected CharacterNamesEnum mCharacterName;
    protected BeanographyPost beanographyPost;
    protected Sprite mSprite;

    public GameCharacter() {
    }

    public Bitmap getmSnapshot() {
        return mSnapshot;
    }

    public void setmSnapshot(Bitmap mSnapshot) {
        this.mSnapshot = mSnapshot;
        mSnapshotHeight = mSnapshot.getHeight();
        mSnapshotWidth = mSnapshot.getWidth();
    }

    public int getmSnapshotHeight() {
        return mSnapshotHeight;
    }

    public Sprite getmSprite() {
        return mSprite;
    }

    public int getmSnapshotWidth() {
        return mSnapshotWidth;
    }

    public List<AnimationDrawable> getmAnimationsList() {
        return mAnimationsList;
    }

    public void setmAnimationsList(List<AnimationDrawable> mAnimationsList) {
        this.mAnimationsList = mAnimationsList;
    }

    public List<Sound> getmSoundList() {
        return mSoundList;
    }

    public void setmSoundList(List<Sound> mSoundList) {
        this.mSoundList = mSoundList;
    }

    public boolean ismUnlocked() {
        return mUnlocked;
    }

    public void setmUnlocked(boolean mUnlocked) {
        this.mUnlocked = mUnlocked;
    }

    public CharacterType getmCharacterType() {
        return mCharacterType;
    }

    public void setmCharacterType(CharacterType mCharacterType) {
        this.mCharacterType = mCharacterType;
    }

    public CharacterNamesEnum getmCharacterName() {
        return mCharacterName;
    }

    public void setmCharacterName(CharacterNamesEnum mCharacterName) {
        this.mCharacterName = mCharacterName;
    }

    public BeanographyPost getBeanographyPost() {
        return beanographyPost;
    }

    public void setBeanographyPost(BeanographyPost beanographyPost) {
        this.beanographyPost = beanographyPost;
    }

    //TODO set up unlocked
    public void setmUnlocked() {
    }



    //Abstract method
    public abstract void draw(Canvas canvas);
    public abstract void animate();
    public abstract void playSound();

}
