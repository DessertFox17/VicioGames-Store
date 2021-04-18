package com.VicioGames.Store.domain.endpointdto;

public class ImageDto {
    private int iId;
    private int prId;
    private String URL;

    //----------------GETTER AND SETTER--------------------------


    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
