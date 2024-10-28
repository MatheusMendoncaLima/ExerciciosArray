package numerosCrescente;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[50];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        for (int name : nums) {
            System.out.println(name);
        }
    }
}
