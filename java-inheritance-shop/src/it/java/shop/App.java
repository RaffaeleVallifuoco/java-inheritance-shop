
//  app.java IS THE NEW carrello.java

package it.java.shop;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.println("=================================================================================");
        System.out.println("============================= DATABASE PRODOTTI =================================");
        System.out.println("=================================================================================");
        System.out.println("");

        Scanner scan = new Scanner(System.in);

        // Creating new null Prodotto istance

        Prodotto newProduct = null;

        String productChoice;

        do {
            System.out.println("Che prodotto vuoi inserire ? ");
            System.out.println(" (S) Smartphone | (T) Tv | (C) Cuffie ");
            System.out.println("");

            productChoice = scan.nextLine();

        } while (!productChoice.equals("s") && !productChoice.equals("t") && !productChoice.equals("c"));

        // Generic product info insert

        System.out.println(" Inserisci ka marca del prodotto");
        String productBrand = scan.nextLine();
        System.out.println("");

        System.out.println(" Inserisci il nome del prodotto");
        String productName = scan.nextLine();
        System.out.println("");

        double productPrice;
        boolean validImput = false;

        // Reapeat cycle until product is correctly initialized;

        do {
            System.out.println("Inserisci il prezzo del prodotto (EUR)");

            // sure that price imput is a correct number

            try {
                productPrice = scan.nextDouble();
                scan.nextLine();

                validImput = true;

                // choice switch (creating specific product istance by choice)

                switch (productChoice) {

                    // SMARTPHONE

                    case "s":

                        System.out.println(" Inserisci l'IMEI del prodotto");
                        String imei = scan.nextLine();
                        System.out.println("");

                        System.out.println(" Inserisci la quantità di memoria del prodotto");
                        long rom = scan.nextLong();
                        System.out.println("");

                        newProduct = new Smartphone(productName, productBrand, productPrice, imei, rom);

                        break;

                    // TV

                    case "t":

                        System.out.println(" Inserisci la dimensione in pollici del prodotto");
                        int inch = scan.nextInt();
                        scan.nextLine();
                        System.out.println("");

                        System.out.println(" Ha funzionalità smart ? ");
                        String smartTv = scan.nextLine();

                        boolean smart = false;

                        if (smartTv.equals("si") || smartTv.equals("SI")) {
                            smart = true;
                        }
                        System.out.println("");

                        newProduct = new Televisori(productName, productBrand, productPrice, inch, smart);
                        break;

                    // HEADPHONE

                    case "c":

                        System.out.println(" Inserisci il colore del prodotto ");
                        String color = scan.nextLine();
                        System.out.println("");

                        System.out.println(" La cuffia è cablata o buetooth ? ");
                        String type = scan.nextLine();
                        System.out.println("");

                        newProduct = new Cuffie(productName, productBrand, productPrice, color, type);

                        break;

                    // DEFAULT

                    default:
                        System.out.println("Scelta non corretta !");

                }
            } catch (InputMismatchException e) {
                System.out.println("Per favore, inserisci un numero valido ! ");
                scan.nextLine();
            }
        } while (!validImput);

        System.out.println("");

        if (newProduct != null) {

            newProduct.print();
        }

        scan.close();

        // if (choice.equals("s") || choice.equals("S")) {

        // System.out.println(" Inserisci ka marca del prodotto");
        // String productBrand = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci il nome del prodotto");
        // String productName = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci l'IMEI del prodotto");
        // String imei = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci la quantità di memoria del prodotto");
        // long rom = scan.nextLong();
        // System.out.println("");

        // System.out.println(" Inserisci il prezzo del prodotto (EUR)");
        // double productprice = scan.nextDouble();
        // System.out.println("");

        // Smartphone myPhone = new Smartphone(productName, productBrand, productprice,
        // imei, rom);

        // myPhone.print();

        // } else if (choice.equals("t") || choice.equals("T")) {

        // System.out.println(" Inserisci ka marca del prodotto");
        // String productBrand = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci il nome del prodotto");
        // String productName = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci la dimensione in pollici del prodotto");
        // int inch = scan.nextInt();
        // String vuoto = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Ha funzionalità smart ? ");
        // String smartTv = scan.nextLine();

        // boolean smart = false;

        // if (smartTv.equals("si") || smartTv.equals("SI")) {
        // smart = true;
        // }
        // System.out.println("");

        // System.out.println(" Inserisci il prezzo del prodotto (EUR)");
        // double productprice = scan.nextDouble();
        // System.out.println("");

        // Televisori myTv = new Televisori(productName, productBrand, productprice,
        // inch, smart);

        // myTv.print();

        // } else if (choice.equals("c") || choice.equals("C")) {

        // System.out.println(" Inserisci ka marca del prodotto");
        // String productBrand = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci il nome del prodotto");
        // String productName = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci il colore del prodotto ");
        // String color = scan.nextLine();
        // System.out.println("");

        // System.out.println(" La cuffia è cablata o buetooth ? ");
        // String type = scan.nextLine();
        // System.out.println("");

        // System.out.println(" Inserisci il prezzo del prodotto (EUR)");
        // double productprice = scan.nextDouble();
        // System.out.println("");

        // Cuffie myHeadphone = new Cuffie(productName, productBrand, productprice,
        // color, type);

        // myHeadphone.print();

        // }

    }

}
