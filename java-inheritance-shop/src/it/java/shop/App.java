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

        } else if (choice.equals("t")) {

            System.out.println(" Inserisci ka marca del prodotto");
            String productBrand = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci il nome del prodotto");
            String productName = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci la dimensione in pollici del prodotto");
            int inch = scan.nextInt();
            System.out.println("");

            System.out.println(" Ha funzionalità smart ? ");
            boolean smart = scan.nextBoolean();
            System.out.println("");

            System.out.println(" Inserisci il prezzo del prodotto (EUR)");
            double productprice = scan.nextDouble();
            System.out.println("");

            Televisori myTv = new Televisori(productName, productBrand, productprice, inch, smart);

            myTv.print();

        } else if (choice.equals("h")) {

            System.out.println(" Inserisci ka marca del prodotto");
            String productBrand = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci il nome del prodotto");
            String productName = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci il colore del prodotto ");
            String color = scan.nextLine();
            System.out.println("");

            System.out.println(" La cuffia è cablata o buetooth ? ");
            String type = scan.nextLine();
            System.out.println("");

            System.out.println(" Inserisci il prezzo del prodotto (EUR)");
            double productprice = scan.nextDouble();
            System.out.println("");

            Cuffie myHeadphone = new Cuffie(productName, productBrand, productprice, color, type);

            myHeadphone.print();

        }

        scan.close();

    }

}
