package com.hydra.christendsouza.aviationio;
/**
 * Created by christendsouza on 07/10/17.
 */

public class CardAccess {
    private String imgURL;
    private String title;

    public CardAccess(String imgURL, String title) {
        this.imgURL = imgURL;
        this.title = title;
    }
    public String getImgURL() {
            return imgURL;
        }
    public void setImgURL(String imgURL) {
            this.imgURL = imgURL;
        }

    public String getTitle() {
            return title;
        }

    public void setTitle(String title) {
            this.title = title;
        }
}
