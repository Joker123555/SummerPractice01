package com.itheima.test1;


import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
         * 用定义方法实现随机产生一个5位数的验证码
         * 长度为5
         * 前四位是大写字母或小写字母
         * 最后一位是数字
         *
         * */
        //1.大写字母和小写字母都放到数组中
        char[] chas = new char[52];
        for (int i = 0; i < chas.length; i++) {
            if (i <= 25) {
                //将小写字母放到数组中
                chas[i] = (char) (97 + i);
            } else {
                //将大写字母放到数组中
                chas[i] = (char) (65 + i - 26);
            }
        }
        //遍历
     /*   for (int i = 0; i < 52; i++) {
            System.out.print(chas[i]+" ");
        }*/
        //2.随机抽取数组四次
        String result = "";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomInt = r.nextInt(chas.length);
            result = chas[randomInt] + result;
        }
        //3.拼接上一个0-9的随机数字
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);


    }
}
