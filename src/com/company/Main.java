package com.company;

public class Main {

    public static void main(String[] args) {
        double[] chisla = {-2.7, 6.3, 3.5, -6.7, 2.1, -7.9, 3.4, -3.3, 9.1, 5.1, -5.3, 13.4, -55.7, 75.7, -32.2};

        double gg = 0;
        int dd = 0;
        for (double i : chisla) {
            if (i > 0) {
                gg = gg + i;
                dd = dd + 1;
            }
        }
        System.out.println(gg/dd);

    }}
