package it.java.shop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.println(" - DATABASE PRODOTTI -");
        System.out.println("-------------------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Che prodotto vuoi inserire ? ");
        System.out.println(" (S) Smartphone | (T) Tv | (C) Cuffie ");

        String choice = scan.nextLine();

        if (choice.equals("s")) {

            System.out.println(" Inserisci ka marca del prodotto");
            String productBrand = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci il nome del prodotto");
            String productName = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci l'IMEI del prodotto");
            String imei = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci la quantità di memoria del prodotto");
            long rom = scan.nextLong();
            System.out.println("");

            System.out.println(" Inserisci il prezzo del prodotto (EUR)");
            double productprice = scan.nextDouble();
            System.out.println("");

            Smartphone myPhone = new Smartphone(productName, productBrand, productprice, imei, rom);

            myPhone.print();

        }

        // System.out.println(" Inserisci il nome del prodotto");
        // String productName = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci ka descrizione del prodotto");
        // String productDescription = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci il prezzo del prodotto (EUR)");
        // double productprice = scan.nextDouble();
        // System.out.println("");

        scan.close();

        // Smartphone smart = new Smartphone();
        // smart.getProductCode ();

        // System.out.println(product.toString());

    }

}
