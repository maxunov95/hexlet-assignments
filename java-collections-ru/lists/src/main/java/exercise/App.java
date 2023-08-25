package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "world")); // true
        System.out.println(App.scrabble("ajv", "java")); // false
        System.out.println(App.scrabble("avjafff", "JaVa")); // true
        System.out.println(App.scrabble("", "hexlet")); // false
    }

    public static boolean scrabble(String symbols, String word) {
        List<Character> listSymbols = new ArrayList<>();
        for (char symbol : symbols.toLowerCase().toCharArray()) {
            listSymbols.add(symbol);
        }

        for (char wordSymbol :
                word.toLowerCase().toCharArray()) {
            if (listSymbols.contains(wordSymbol)) {
                listSymbols.remove(listSymbols.indexOf(wordSymbol));
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
