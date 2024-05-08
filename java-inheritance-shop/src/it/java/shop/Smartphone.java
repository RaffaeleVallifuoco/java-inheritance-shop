package it.java.shop;

public class Smartphone extends Prodotto {

    private String imeiCode;
    private int romSize;

    public String getImeiCode() {
        return imeiCode;
    }

    public int getRomSize() {
        return romSize;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public void setRomSize(int romSize) {
        this.romSize = romSize;
    }

    // CONSTRUCTORS

    public Smartphone() {

    }

}
