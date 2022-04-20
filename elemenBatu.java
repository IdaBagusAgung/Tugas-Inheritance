package com.dicoding.javafundamental.inheritance;

public class elemenBatu extends Inazuma{
    @Override
    void data() {
        nama="Zongli";
        hp=4300;
        damage_attack=1100;
        defence=3300;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}
