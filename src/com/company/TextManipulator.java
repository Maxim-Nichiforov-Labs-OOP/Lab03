package com.company;

import java.util.*;

public class TextManipulator {

    public TextManipulator() {
    }

    public void ShowNumberOfWordsAndSentences(String text) {
        if (text == null) {
            return;
        }

        int countOfWords = text.split(" ").length;
        int countOfSentences = text.split("\\.").length;

        System.out.println("Number of words = "+ countOfWords);
        System.out.println("Number of sentences = "+ countOfSentences);
    }

    public void ShowNumberOfLettersVowelsAndConsonants(String text) {
        if (text == null) {
            return;
        }

        int lettersCounter = 0;
        for (char symbol:
             text.toCharArray()) {
            if (Character.isLetter(symbol)) {
                lettersCounter++;
            }
        }

        int vowelsCounter = 0;
        int consonantsCounter = 0;
        for (char symbol:
                text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u')
                vowelsCounter++;
            else if (symbol != '.' && symbol != ' ' && symbol != ',')
                consonantsCounter++;
        }

        System.out.println("Number of letters: " + lettersCounter);
        System.out.println("Number of vowels: " + vowelsCounter);
        System.out.println("Number of consonants: " + consonantsCounter);
    }

    public void ShowTop5WordsAndLongestOne(String text) {
        if (text == null) {
            return;
        }

        Hashtable<String, Integer> words = new Hashtable<String, Integer>();
        var loweredText = text.toLowerCase();
        String longestWord = "";

        for (String word:
             loweredText.split(" ")) {
            word = word.replaceAll("\\.", "");
            word = word.replaceAll(" ", "");
            word = word.replaceAll(",", "");

            var chk = words.containsKey(word);

            if (chk) {
                var num = words.get(word);
                words.put(word, num+1);
            }
            else {
                words.put(word, 1);

                if (longestWord.length() < word.length())
                    longestWord = word;
            }
        }

        System.out.println("The longest word: "+longestWord);


        var numberOfWords = words.size();

        ArrayList<Map.Entry<String, Integer>> l = new ArrayList(words.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<?, Integer>>(){

            public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }});
        //System.out.println(l);

        Map<String, Integer> mapSortedByValues = new LinkedHashMap<String, Integer>();

        if (numberOfWords <= 5) {
            for (Map.Entry<String, Integer> entry : l) {
                mapSortedByValues.put(entry.getKey(), entry.getValue());
            }
        }
        else {
            int i = 0;
            for (Map.Entry<String, Integer> entry : l) {
                if (i >= numberOfWords - 5) {
                    mapSortedByValues.put(entry.getKey(), entry.getValue());
                }
                i += 1;
            }
        }
        System.out.println("Top 5 most used words: "+mapSortedByValues);
    }
}
