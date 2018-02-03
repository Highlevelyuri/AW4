package com.company;

public class Main {

    public static void main(String[] args) {
        int n= 0;

	do {

        n++;
        for (int x = 110;  x < 400 ; x++) {
            if (x % 19 == 0)
                System.out.println(x);


        }
        break;

    }
    while (n < 15);
    }
}
