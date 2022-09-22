package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.data.Dragon;

public class Task03 {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();
        Dragon dragon3 = new Dragon();

        dragon1.type = "Monster";
        dragon2.type = "BigAnimal";
        Dragon.type = "SmallAnimal";


        System.out.println(dragon1.type);
        System.out.println(dragon2.type);
        System.out.println(dragon3.type);
        System.out.println(Dragon.type);
    }
}
