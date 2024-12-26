package com.alogrithmpr.week17;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a[] = new int[N];

        for(int i=0;i<N;i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int sum = a[0];

        for(int i=1;i<N;i++) {
            a[i] += a[i-1];
            sum+=a[i];
        }

        System.out.println(sum);
    }

}
