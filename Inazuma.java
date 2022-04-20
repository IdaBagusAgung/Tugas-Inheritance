package com.dicoding.javafundamental.inheritance;

public class Inazuma extends Hero{
    @Override
    void data(){
        archon = "Raiden Shogun";
        kekayaan = 25;
        luas_daerah = 10;

        System.out.println("\nnama archon Inazuma :" + archon);
        System.out.println("Kekayaan Inazuma (M) : " + kekayaan);
        System.out.println("Luas Daerah Inazuma (KM) :" + luas_daerah);
    }
}
