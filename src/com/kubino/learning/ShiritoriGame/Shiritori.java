package com.kubino.learning.ShiritoriGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Shiritori {
    private final List<String> alreadySaidWords;

    public Shiritori() {
        alreadySaidWords = new ArrayList<String>();
    }

    public void runGame(String... words) {
        if (formatInput(words)) {
            alreadySaidWords.add(words[0]);
            var passed = true;
            var lastGood = 0;
            for (int i = 1; i < words.length; i++) {
                passed = play(words[i], words[i - 1]);
                if (!passed){
                    System.out.println("Invalid - word " + words[lastGood + 1] + " should start with "
                            + words[lastGood].charAt(words[lastGood].length() - 1));
                    break;
                }
                for (var alreadySaid : alreadySaidWords) {
                    if (alreadySaid.equals(words[i])) {
                        passed = false;
                        System.out.println("Invalid - word " + words[i] + " has been already said");
                        break;
                    }
                }
                alreadySaidWords.add(words[i]);
                lastGood = i;
            }
            if (passed) {
                System.out.println("Valid");
            }
        } else {
            System.out.println("Game over");
        }
    }

    private boolean play(String word, String previous) {
        return previous.endsWith(word.substring(0, 1));
    }

    private boolean formatInput(String[] words) {
        var tempWords = new String[words.length];
        CharSequence illegalChars = "1234567890,.!@#$%^&*()_-+=[]{};:'\"\\|,<.>/?~`§±";
        for (var word : words) {
            word = word.toLowerCase(Locale.ROOT);
            word = word.stripTrailing();
            if (word.contains(illegalChars)) {
                return false;
            }
        }

        words = tempWords;

        return true;
    }


    public List<String> getAlreadySaidWords() {
        return alreadySaidWords;
    }

}
