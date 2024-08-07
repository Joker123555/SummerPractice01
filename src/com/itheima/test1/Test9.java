package com.itheima.test1;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*需求
         * 一共有{2,588,888,1000,10000}  五种奖金
         * 打印出每个奖项，奖项的出现顺序要随机且不重复
         * 例：888元的奖金被抽出
         *
         * */
        //分析
        //1.将奖池中的顺序打乱
        int[] arr= {2,588,888,1000,10000};
        //获取随机索引
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int random =r.nextInt(arr.length);
            //将i与随机索引进行交换
            int temp=arr[i];
            arr[i]=arr[random];
            arr[random]=temp;

        }
        //2.遍历奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
