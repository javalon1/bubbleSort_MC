package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {

        int[] tab = new int[]{2, 1, 3, 4, 9, 6, 7, 8};

        for (int i = 0; i < tab.length - 1; i++) {
            int a = 0;
            if (tab[i] > tab[i + 1]) {
                a = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = a;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
