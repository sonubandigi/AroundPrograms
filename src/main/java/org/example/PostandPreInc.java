package org.example;

import java.util.Scanner;

public class PostandPreInc {
    public static void main(String[] args) {

        int x = 0;
        int y = 5;


        while (y-- > 0) {
            x++;
        }
        System.out.println(x);
    }
}
