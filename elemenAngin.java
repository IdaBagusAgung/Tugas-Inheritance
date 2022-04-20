package com.dicoding.javafundamental.inheritance;

public class elemenAngin extends Mondstat{
    @Override
    void data() {
        nama="Kazuha";
        hp=5000;
        damage_attack=800;
        defence=4300;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}
