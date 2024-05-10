package it.java.shop;

public class Cuffie extends Prodotto {

    private String headphoneColor;
    private String headphoneType;

    public void setHeadphoneColor(String headphoneColor) {
        this.headphoneColor = headphoneColor;
    }

    public void setHeadphoneType(String headphoneType) {
        this.headphoneType = headphoneType;
    }

    public String getHeadphoneColor() {
        return headphoneColor;
    }

    public String getHeadphoneType() {
        return headphoneType;
    }

    // CONSTRUCTORS

    public Cuffie(String productName, String productBrand, double productPrice, String headphoneColor,
            String headphoneType) {

        super(productName, productBrand, productPrice);
        this.productCode = super.productCode;
        this.headphoneColor = headphoneColor;
        this.headphoneType = headphoneType;

    }

    @Override

    public void print() {

        super.print();

        System.out.println(" Colore  : " + this.headphoneColor);
        System.out.println("");

        System.out.println(" Tipo : " + this.headphoneType);
        System.out.println("");

    }

}
