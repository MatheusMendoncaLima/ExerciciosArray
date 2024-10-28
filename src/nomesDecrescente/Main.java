package nomesDecrescente;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        Arrays.sort(names, Collections.reverseOrder());
        for (String name : names) {
            System.out.println(name);
        }
    }
}
