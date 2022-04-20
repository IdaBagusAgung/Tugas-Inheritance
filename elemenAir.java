package com.dicoding.javafundamental.inheritance;

public class elemenAir extends Mondstat{
    @Override
    void data() {
        nama="Ayato";
        hp=3200;
        damage_attack=2000;
        defence=2200;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}
