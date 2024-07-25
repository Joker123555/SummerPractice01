package com.itheima;


import java.util.Scanner;

//计算飞机票价格
public class text1 {
    public static void main(String[] args) {
        int current;
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int month = sc.nextInt();

        //1为头等舱，2为经济舱
        int i = sc.nextInt();

        //month不能超过12
        if (month <= 12) {

            //如果是旺季（5-10月）头等舱9折   经济舱8.5折
            if (month >= 5 && month <= 10) {
                if (i == 1) {
                    current = (int) (original * 0.9);
                    System.out.println("头等舱现价" + current);
                } else if (i == 2) {
                    current = (int) (original * 0.85);
                    System.out.println("经济舱现价" + current);
                }

            }
            //如果是淡季（11月-来年4月）头等舱7折   经济舱6.5折
            else {
                if (month >= 1 && month <= 4 || month >= 11 && month <= 12) {
                    if (i == 1) {
                        current = (int) (original * 0.7);
                        System.out.println("头等舱现价" + current);
                    } else if (i == 2) {
                        current = (int) (original * 0.65);
                        System.out.println("经济舱现价" + current);
                    }
                }
            }
        } else {
            System.out.println("输入月份错误，请重新输入！");
        }
    }
}