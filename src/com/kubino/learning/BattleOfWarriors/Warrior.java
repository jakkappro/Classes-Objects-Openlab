package com.kubino.learning.BattleOfWarriors;

import java.util.ArrayList;
import java.util.List;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private List<Item> items;
    private int totalForce;

    public Warrior(String name, int life, int speed, int muscle, Item... items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = new ArrayList<Item>();
        for (var item : items) {
            this.items.add(item);
        }
        totalForce = life + speed + muscle;
    }

    public int getTotalForce() {
        return totalForce;
    }

    public Item removeItem() {
        Item ret;
        var maxValue = 0;
        var index = 0;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getValue() >= maxValue) {
                index = i;
                maxValue = items.get(i).getValue();
            }
        }

        ret = items.get(index);
        items.remove(index);

        return ret;
    }

    public void getItem(Item item) {
        items.add(item);
    }

    public void getDamage(int amount) {
        life -= amount;
    }

    public int getMuscle() {
        return muscle;
    }

    public static int Battle(Warrior w1, Warrior w2) {
        if (w1.getTotalForce() > w2.getTotalForce()) {
            w2.getDamage(w1.getMuscle());
            w1.getItem(w2.removeItem());
            return 1;
        } else if (w1.getTotalForce() < w2.getTotalForce()) {
            w1.getDamage(w2.getMuscle());
            w2.getItem(w1.removeItem());
            return 2;
        } else {
            w1.getDamage(w2.getMuscle());
            w2.getDamage(w1.getMuscle());
            return 0;
        }
    }

    @Override
    public String toString() {
        return name + " " + life + " " + items.toString();
    }
}
