package it.java.shop;

import java.util.Random;

public class Prodotto {

    protected int productCode;
    protected String productName;
    protected String productBrand;
    protected double productPrice;
    protected static final double IVA = 0.22;

    protected int getProductCode() {
        return productCode;
    }

    public void setProductBame(String productBame) {
        this.productName = productBame;
    }

    public void setProductDescription(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBame() {
        return productName;
    }

    public String getProductDescription() {
        return productBrand;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public static double getIva() {
        return IVA;
    }

    // CONSTRUCTORS

    public Prodotto() {
    }

    public Prodotto(String productName, String productBrand, Double productPrice) {

        this.productName = productName;
        this.productBrand = productBrand;
        this.productPrice = productPrice;

        Random code = new Random();

        this.productCode = code.nextInt(200);

    }

    public double ivaPrice() {

        return this.productPrice + (this.productPrice * IVA);
    }

    public String extendedName() {

        return this.productName + "-" + this.productCode;
    }

    public static String extendedCode(int productCode) {

        String exetendedCode = String.format("%08d", productCode);

        return exetendedCode;
    }

    public void print() {

        System.out.println(" Prodotto inserito :");
        System.out.println("");

        System.out.println(" Prezzo discount ; " + this.getProductPrice() + " €");

        System.out.println(" Modello e identificativo prodotto : " + this.extendedName());

        System.out.println(" Prezzo ivato : " + this.ivaPrice() + " €");

        System.out.println(" EAN code : " + Prodotto.extendedCode(this.getProductCode()));

        System.out.println("");
        System.out.println("");
    }

    public String toString() {
        return productCode + extendedName();
    }

}