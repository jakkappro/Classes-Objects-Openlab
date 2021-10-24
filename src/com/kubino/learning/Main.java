package com.kubino.learning;

import com.kubino.learning.BattleOfWarriors.*;

public class Main {
    public static void main(String[] args) {
        var item1 = new Item("1", 5);
        var item2 = new Item("2", 6);
        var item3 = new Item("3", 4);

        var w1 = new Warrior("ahoj", 5, 4, 4, item1, item2);
        var w2 = new Warrior("hehe", 6, 5, 4, item3);

        System.out.println(Warrior.Battle(w1, w2));
        System.out.println(w1.toString());
        System.out.println(w2.toString());
    }
}
