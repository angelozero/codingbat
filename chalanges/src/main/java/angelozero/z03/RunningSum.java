package angelozero.z03;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(execute(new int[1])));
    }

    public static int[] execute(int[] nums) {

        if (nums != null && nums.length > 0) {

            int aux = nums[0];
            int[] finalSum = new int[nums.length];

            finalSum[0] = aux;

            for (int x = 0; x < nums.length; x++) {
                if (x != 0) {
                    int sum = sumValues(aux, nums[x]);
                    aux = sum;
                    finalSum[x] = sum;
                } else {
                    finalSum[x] = nums[x];
                }
            }

            return finalSum;
        }

        return new int[0];
    }

    private static int sumValues(int a, int b) {
        return a + b;
    }
}