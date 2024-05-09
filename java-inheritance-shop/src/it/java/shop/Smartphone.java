package it.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {

    private String imeiCode;
    private long romSize;

    public String getImeiCode() {
        return imeiCode;
    }

    public long getRomSize() {
        return romSize;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public void setRomSize(long romSize) {
        this.romSize = romSize;
    }

    // CONSTRUCTORS

    public Smartphone(String productName, String productBrand, double productPrice, String imei, long rom) {

        super(productName, productBrand, productPrice);
        this.productCode = super.productCode;
        this.imeiCode = imei;
        this.romSize = rom;

    }

    public void print() {

        super.print();

        System.out.println(" Codice IMEI : " + this.imeiCode);
        System.out.println("");

        System.out.println(" Dimensione memoria : " + this.romSize);
        System.out.println("");

    }

}
