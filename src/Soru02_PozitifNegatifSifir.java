package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bana bir sayi soyle");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        if (sayi > 0){
            System.out.println("Sayi pozitiftir");
        } else { if (sayi < 0) {
            System.out.println("Sayi negatiftir");
        }else {
            System.out.println("Sayi 0`dir");
        }
        }






    }
}
