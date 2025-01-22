package angelozero.z07;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct("angelo",
                "aaabbbccccangedddeeelozzzz"));
    }

    public class RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct("angelo", "aaabbbccccangedddeeelozzzz"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        // primeira solução
        // if (ransomNote.length() > magazine.length()) {
        //     return false;
        // }
        // 
        // var auxNote = "";
        // var ransomNoteList = ransomNote.split("");
        // 
        // for (int x = 0; x < ransomNoteList.length; x++) {
        // 
        //     for (int y = 0; y < magazine.split("").length; y++) {
        //         var auxList = magazine.split("");
        //         var letterRansomNote = ransomNoteList[x];
        //         var letterMagazine = auxList[y];
        // 
        //         if (letterRansomNote.equalsIgnoreCase(letterMagazine)) {
        //             auxNote += letterMagazine;
        // 
        //             int index = magazine.indexOf(letterMagazine);
        // 
        //             if (index != -1) {
        //                 magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        //                 break;
        //             }
        //         }
        //     }
        // }
        //
        //return auxNote.length() == ransomNote.length();

        // Solução pela IA
//      Map<Character, Integer> letterCount = new HashMap<>();
//
//        for (char letter : magazine.toCharArray()) {
//            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
//        }
//
//        for (char letter : ransomNote.toCharArray()) {
//            if (!letterCount.containsKey(letter) || letterCount.get(letter) == 0) {
//                return false; // A letra não está disponível na magazine
//            }
//            letterCount.put(letter, letterCount.get(letter) - 1); // Usar uma letra
//        }
//
//        return true;

        // Minha solução final
        Map<String, Integer> lettersMap = new HashMap<>();

        var validWord = "";

        var magazineList = magazine.split("");
        var wordList = word.split("");

        for (String letter : magazineList) {

            if (lettersMap.containsKey(letter)) {
                lettersMap.put(letter, lettersMap.get(letter) + 1);

            } else {
                lettersMap.put(letter, 1);
            }
        }


        for (String letter : wordList) {
            if (lettersMap.containsKey(letter) && lettersMap.get(letter) > 0) {
                validWord += letter;
                lettersMap.put(letter, lettersMap.get(letter) - 1);
            }
        }

        return validWord.equals(word);
    }
}
