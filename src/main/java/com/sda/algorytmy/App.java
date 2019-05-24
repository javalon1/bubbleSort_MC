package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {

        int[] tab = new int[]{2, 4, 1, 3, 9, 6, 8, 7};
        int x = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int a = 0; a < tab.length - 1; a++) {
                if (tab[a] > tab[a + 1]) {
                    x = tab[a];
                    tab[a] = tab[a + 1];
                    tab[a + 1] = x;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
