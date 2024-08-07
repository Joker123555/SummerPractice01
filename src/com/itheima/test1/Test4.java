package com.itheima.test1;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*需求
        *  把一个数组中的元素复制到一个新的数组中
        * */
        //分析
        //1.创建一个数组
        Random r = new Random();
        int[] number1=new int[10];
        //赋值
        for (int i = 0; i < 10; i++) {
            int i1 = r.nextInt(10);
            number1[i]=i1;
        }
        System.out.println("第一组数组的值为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(+number1[i]+" ");
        }
        System.out.println();
        //2.创建一个大小相同的的新数组
          int[] number2=new int[10];
        //3.用遍历将数组进行复制
        for (int i = 0; i < 10; i++) {
            number2[i]=number1[i];
        }
        System.out.println("第二组数组的值为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(+number2[i]+" ");
        }
    }
}
