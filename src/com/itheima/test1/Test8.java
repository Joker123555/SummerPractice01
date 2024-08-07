package com.itheima.test1;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        /*需求
         * 一共有{2,588,888,1000,10000}  五种奖金
         * 打印出每个奖项，奖项的出现顺序要随机且不重复
         * 例：888元的奖金被抽出
         *
         * */
        //分析
        //1.将奖金放到数组中
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];


       /* for (int i = 0; i < arr.length; i++) {


            //3.核实新数组中是否已存在该奖金
            for (int i1 = 0; i1 < arr.length; ) {
                if (arr[text]!= newArr[i1]) {
                    newArr[i1]=arr[text];
                    i1++;

                }
            }
            //4.打印对应奖励
            System.out.println(prize+"元的奖金被抽出");*/

        //2.用random随机抽出角标放入另一个数组中
        Random rand = new Random();

        //一个循环只做一件事
        for (int i = 0; i < 5;) {
            int text = rand.nextInt(arr.length);
            int prize=arr[text];
            boolean flag =contains(newArr,prize);
            if (!flag) {
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]+"元的奖金被抽出");
        }

    }
    //将判断奖金是否已经存在放到一个方法中
    //true 则为有重复项
    //false 则为没有重复项
    public static boolean contains(int[] newArr, int prize) {
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
