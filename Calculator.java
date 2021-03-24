package com.company;

import java.util.Scanner;

public class Calculator {
    int x, y, N;
    public Calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ricxvi 1 - ");
        x = scanner.nextInt();

        System.out.println("N-1 = mimateba");
        System.out.println("N-2 = gamokleba");
        System.out.println("N-3 = gamravleba");
        System.out.println("N-4 = gayofa");
        System.out.println("N-5 = axarisxeba");
        System.out.println("N-6 = fesvi");
        System.out.print("N= ");
        N = scanner.nextInt();
        if (N!=6){
        System.out.print("ricxvi 2 - ");
        y = scanner.nextInt();
    }
    }

    public void m1(){
        if (N == 1) {
            System.out.print("mimateba = ");
            System.out.println(x + y);
        }
    }
    public void m2(){
        if (N == 2) {
        System.out.print("gamokleba = ");
        System.out.println(x-y);
        }
    }
    public void m3(){
        if (N == 3) {
            System.out.print("gamravleba = ");
            System.out.println(x * y);
        }
    }
    public void m4(){
        if (N == 4) {
        System.out.print("gayofa = ");
        System.out.println(x/y);
        }
    }
    public void m5(){
        if (N == 5) {
            System.out.print("xarisxi = ");
            System.out.println(Math.pow(x, y));
        }
    }
    public void m6(){
        if (N == 6) {
            System.out.print("fesvi = ");
            System.out.println(Math.sqrt(x));
        }

    }
}
