package com.kubino.learning;

import com.kubino.learning.ShiritoriGame.Shiritori;

public class Main {
    public static void main(String[] args) {
        var shiritori = new Shiritori();
        shiritori.runGame("word", "dowry", "yodel", "leader", "righteous", "serpent");
        shiritori.runGame("motive", "beach");
        shiritori.runGame("hive", "eh", "hive");
    }
}
