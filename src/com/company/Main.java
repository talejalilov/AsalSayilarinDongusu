package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Başlanğıç sayını giriniz: ");
        int a = sc.nextInt();
        System.out.println("Son sayını giriniz: ");
        int b = sc.nextInt();

        if(a>0 && b>0) {

            int toplam=0;
            int kactane =0;

            for(int i = a; i<=b;i++){
                int sayac =0;

                for(int j =2; j<=i; j++){
                    if(i%j==0)
                        sayac++;

                }if (sayac==1) {
                    toplam +=i;
                    kactane++;
                }

            }
            System.out.println(kactane+"sayisi");
            System.out.println(toplam);

        }

    }
}
