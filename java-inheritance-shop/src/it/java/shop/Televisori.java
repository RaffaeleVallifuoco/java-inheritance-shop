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

    public Televisori(String productName, String productBrand, double productPrice, int tvSize, boolean smartTv) {

        super(productName, productBrand, productPrice);
        this.tvSize = tvSize;
        this.smartTv = smartTv;

    }

    public void print() {

        super.print();

        System.out.println(" Dimensione : : " + this.tvSize + "''");
        System.out.println("");

        System.out.println(" Snart TV ? : " + this.smartTv);
        System.out.println("");

    }

}
