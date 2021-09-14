package com.company;

import java.util.Scanner;

public class arrayadd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = {1, 22, 333, 4444, 55555, 666666, 7777777};
        do {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入数值：");
            int addNum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;
            System.out.println("扩容后的数据：");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
            System.out.println("请输入 n / y ");
            char key = myScanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
    }
}