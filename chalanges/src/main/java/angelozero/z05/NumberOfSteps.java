package angelozero.z05;

public class NumberOfSteps {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(2));
    }

    public static int numberOfSteps(int num) {

        int totalSteps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;

            } else {
                num -= 1;
            }

            totalSteps++;
        }

        return totalSteps;
    }
}
