package com.alogrithmpr.week16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coin0 {
    //  N 종류의 동전으로 값 K 만들기

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> number = new ArrayList<>();
        int count = 0;
        while (true) {
            if (count == N) {
                break;
            }
            int input = sc.nextInt();
            number.add(input);
            count ++;
        }


        Collections.reverse(number);

        int sum = 0;
        for( int i= 0; i<N; i++) {
            if(number.get(i) <= K) {
                int Q = K / number.get(i);
                K = K % number.get(i);
                sum = sum + Q;
                if (K == 0) break;
            }
        }

        System.out.println(sum);

    }
}
