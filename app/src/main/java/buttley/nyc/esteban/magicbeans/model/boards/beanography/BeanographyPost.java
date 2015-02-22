package buttley.nyc.esteban.magicbeans.model.boards.beanography;

/**
 * Created by Tara on 12/30/2014.
 */
public class BeanographyPost {

    private int mName;
    private int mType;
    private int mHome;
    private int mLikes;
    private int mDislikes;
    private int mQuotes;
    private int mSnapshot;

    public BeanographyPost(int mName, int mType, int mHome, int mLikes, int mDislikes, int mQuotes,
                           int mSnapshot) {
        this.mName = mName;
        this.mType = mType;
        this.mHome = mHome;
        this.mLikes = mLikes;
        this.mDislikes = mDislikes;
        this.mQuotes = mQuotes;
        this.mSnapshot = mSnapshot;
    }

    public int getmName() {
        return mName;
    }

    public void setmName(int mName) {
        this.mName = mName;
    }

    public int getmLikes() {
        return mLikes;
    }

    public void setmLikes(int mLikes) {
        this.mLikes = mLikes;
    }

    public int getmDislikes() {
        return mDislikes;
    }

    public void setmDislikes(int mDislikes) {
        this.mDislikes = mDislikes;
    }

    public int getmHome() {
        return mHome;
    }

    public void setmHome(int mHome) {
        this.mHome = mHome;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public int getmQuotes() {
        return mQuotes;
    }

    public void setmQuotes(int mQuotes) {
        this.mQuotes = mQuotes;
    }

    public int getmSnapshot() {
        return mSnapshot;
    }

    public void setmSnapshot(int mSnapshot) {
        this.mSnapshot = mSnapshot;
    }
}
