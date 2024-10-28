package tabelaCampeonato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "Botafogo";
        names[1] = "Palmeiras";
        names[2] = "Fortaleza";
        names[3] = "Flamengo";
        names[4] = "Internacional";
        names[5] = "São Paulo";
        names[6] = "Bahia";
        names[7] = "Cruzeiro";
        names[8] = "Atletico Mineiro";
        names[9] = "Vasco da Gama";

        for (int i = 0; i < names.length; i++) {
            System.out.println(String.format("%s - %s", i+1, names[i]));

        }

    }
}
