package it.java.shop;

import java.util.Random;

public class Prodotto {

    private int productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private static final double IVA = 0.22;

    public int getProductCode() {
        return productCode;
    }

    public void setProductBame(String productBame) {
        this.productName = productBame;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBame() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
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

    public Prodotto(String productName, String productDescription, Double productPrice) {

        this.productName = productName;
        this.productDescription = productDescription;
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

    public void pricePrint() {

        System.out.println(" Prodotto inserito :");
        System.out.println("");

        System.out.println(" Prezzo discount ; " + this.getProductPrice() + " €");

        System.out.println(" Nome e identificativo prodotto : " + this.extendedName());

        System.out.println(" Prezzo ivato : " + this.ivaPrice() + " €");

        System.out.println(" EAN code : " + Prodotto.extendedCode(this.getProductCode()));

        System.out.println("");
        System.out.println("");
    }

}