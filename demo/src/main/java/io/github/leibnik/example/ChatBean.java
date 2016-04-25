package io.github.leibnik.example;

/**
 * Created by Droidroid on 2016/4/25.
 */
public class ChatBean {
    public static final int LEFT_TEXT = 0;
    public static final int LEFT_IMAGE = 1;
    public static final int RIGHT_TEXT = 2;
    public static final int RIGHT_IMAGE = 3;
    int type;
    String text;
    int imgId;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
