package numerosDecrescente;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[50];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}

