package com.dicoding.javafundamental.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        elemenApi m = new elemenApi();
        elemenAir a = new elemenAir();
        elemenAngin t = new elemenAngin();
        elemenBatu f = new elemenBatu();
        elemenListrik g = new elemenListrik();

        Mondstat md = new Mondstat();
        Inazuma iz = new Inazuma();

        int pilihan2;
        int pilihan;
        System.out.println("DATA ASAL HERO");
        System.out.println("1. Mondstat");
        System.out.println("2. Inazuma");
        System.out.println("Inputkan Pilihan : ");
        pilihan2 = input.nextInt();
        if(pilihan2 == 1){
            System.out.println("1. Elemen Api");
            System.out.println("2. Elemen Air");
            System.out.println("3. Elemen Angin");
            System.out.print("Inputkan Pilihan:");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                md.data();
                m.data();
            }else if(pilihan == 2) {
                md.data();
                a.data();
            }else if(pilihan == 3) {
                md.data();
                t.data();
            }else{
                System.out.println("Inputan anda salah");
            }
        }else if(pilihan2 == 2){
            System.out.println("4. Elemen Batu");
            System.out.println("5. Elemen Listrik");
            System.out.print("Inputkan Pilihan:");
            pilihan = input.nextInt();

            if(pilihan == 4) {
                iz.data();
                f.data();
            }else if(pilihan == 5) {
                iz.data();
                g.data();
            }else{
                    System.out.println("Inputan anda salah");
            }
        }else{
            System.out.println("Inputan anda salah");
        }

    }
}
