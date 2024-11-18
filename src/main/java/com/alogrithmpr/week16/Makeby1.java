package com.alogrithmpr.week16;

import java.util.Scanner;

public class Makeby1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] temp = new int[N+1];

        int count =0;
        temp[1] = 0;

        for(int i=2; i<=N; i++){
            temp[i] = temp[i-1] + 1;

            if(i%2 == 0) {
                temp[i] = Math.min(temp[i], temp[i/2]+1);
            }
            if(i%3 == 0) {
                temp[i] = Math.min(temp[i], temp[i/3]+1);
            }
        }


        System.out.println(temp[N]);
    }

}
