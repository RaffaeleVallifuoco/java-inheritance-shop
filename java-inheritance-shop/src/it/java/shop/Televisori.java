package it.java.shop;

public class Televisori extends Prodotto {

    private int tvSize;
    private boolean smartTv;

    public void setTvSize(int tvSize) {
        this.tvSize = tvSize;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public int getTvSize() {
        return tvSize;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    // CONSTRUCTORS

    public Televisori() {

    }

}
