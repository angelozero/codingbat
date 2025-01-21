package angelozero.z07;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct("angelo",
                "aaabbbccccangedddeeelozzzz"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        var auxNote = "";
        var ransomNoteList = ransomNote.split("");

        // Minha solução
        for (int x = 0; x < ransomNoteList.length; x++) {

            for (int y = 0; y < magazine.split("").length; y++) {
                var auxList = magazine.split("");
                var letterRansomNote = ransomNoteList[x];
                var letterMagazine = auxList[y];

                if (letterRansomNote.equalsIgnoreCase(letterMagazine)) {
                    auxNote += letterMagazine;

                    int index = magazine.indexOf(letterMagazine);

                    if (index != -1) {
                        magazine = magazine.substring(0, index) + magazine.substring(index + 1);
                        break;
                    }
                }
            }
        }

        return auxNote.length() == ransomNote.length();

        // Solução pela IA
//        Map<Character, Integer> letterCount = new HashMap<>();
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
    }
}
