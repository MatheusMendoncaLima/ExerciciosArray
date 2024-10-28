package numerosPares;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
