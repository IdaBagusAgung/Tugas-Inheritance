package com.dicoding.javafundamental.inheritance;

public class elemenListrik extends Inazuma{
    @Override
    void data() {
        nama="Beidou";
        hp=2000;
        damage_attack=2250;
        defence=1300;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}
