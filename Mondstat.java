package com.dicoding.javafundamental.inheritance;

public class Mondstat extends Hero{
    @Override
    void data(){
        archon = "Venti";
        kekayaan = 30;
        luas_daerah = 50;

        System.out.println("\nnama archon Mondstat :" + archon);
        System.out.println("Kekayaan Mondstat (M) : " + kekayaan);
        System.out.println("Luas Daerah Mondstat (KM) :" + luas_daerah);
    }
}
