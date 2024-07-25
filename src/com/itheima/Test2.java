package com.itheima;

public class Test2 {
    public static void main(String[] args) {
        //判断101到200之前有多少个素数
        //素数   只有1和它本身两个因数
        //1.遍历101-200
        //2.找出有多少个素数
        int count = 0;

        for (int i = 101; i < 201; i++) {
            boolean flag = true;

            //判断i是否为素数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("当前的"+i+"为素数");
                count++;
            }
        }
        System.out.println("一共有"+count+"个素数");


    }
}
