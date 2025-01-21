package angelozero.z04;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(execute(1));
    }

    public static List<String> execute(int n) {
        int[] fizzBuzzList = new int[n];
        List<String> finalList = new ArrayList<String>();

        for (int x = 1; x <= fizzBuzzList.length; x++) {

            if (x % 3 == 0 && x % 5 == 0) {
                finalList.add("FizzBuzz");

            } else if (x % 3 == 0) {
                finalList.add("Fizz");

            } else if (x % 5 == 0) {
                finalList.add("Buzz");

            } else {
                finalList.add(String.valueOf(x));
            }
        }

        return finalList;
    }
}