package com.company;

import java.util.Scanner;

public class arrayreduce {
    public static void main(String[] args) {
        Scanner mysacanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        do {
            int[] newarr = new int[arr.length - 1];
            for (int i = 0; i < newarr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
            if (newarr.length < 2) {
                System.out.println("无法继续缩减");
                break;
            }
            System.out.println("缩减后的数组：");
            for (int i = 0; i < newarr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
            System.out.println("请输入 n / y ");
            char key = mysacanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
    }
}