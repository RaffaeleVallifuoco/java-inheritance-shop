package it.java.shop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.println(" - DATABASE PRODOTTI -");
        System.out.println("-------------------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println(" Inserisci il nome del prodotto");
        String productName = scan.nextLine();
        System.out.println("");

        System.out.println(" Inserisci ka descrizione del prodotto");
        String productDescription = scan.nextLine();
        System.out.println("");

        System.out.println(" Inserisci il prezzo del prodotto (EUR)");
        double productprice = scan.nextDouble();
        System.out.println("");

        Prodotto product = new Prodotto(productName, productDescription, productprice);

        product.pricePrint();

        scan.close();

    }

}
