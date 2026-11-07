package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Notunu soyler misin");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        if(sayi < 0 || sayi  > 100  ){
            System.out.println("Not gecersiz");
        }else{
            if (sayi == 0 || sayi < 50 ){
                System.out.println("Notunuz FF");
            }else{
                if (sayi == 50 || sayi < 60) {
                    System.out.println("Notunuz CC");
                }else{
                    if (sayi == 60 || sayi < 70) {
                        System.out.println("Notunuz CB");
                    }else{
                        if (sayi == 70 || sayi < 80) {
                            System.out.println("Notunuz BB");
                        }else{
                            if (sayi == 80 || sayi < 90) {
                                System.out.println("Notunuz BA");
                            }else{
                                if (sayi == 90 || sayi <= 100) {
                                    System.out.println("Notunuz AA");
                                }
                            }
                        }
                    }
                }
            }
        }




    }
}
