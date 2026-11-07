package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bana 1. sayiyi soyle");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        System.out.println("Bana 2. sayiyi soyle");
        int sayi1 = input.nextInt();
        if (sayi > sayi1){
            System.out.println("1. sayi daha buyuktur");
        } else { if (sayi < sayi1) {
            System.out.println("2. sayi daha buyuktur");
        }else {
            System.out.println("Sayilar esittir");
        }
        }



    }
}
