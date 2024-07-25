package com.itheima;


import java.util.Scanner;

//计算飞机票价格
public class Test1 {
    public static void main(String[] args) {
        int price = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入机票的原价：");
        int ticket = sc.nextInt();

        System.out.println("请输入月份：");
        int month = sc.nextInt();

        //month不能超过12
        if (month <= 12) {
            //1为头等舱，2为经济舱
            System.out.println("请输入机舱为头等舱（1），经济舱（2）：");
            int i = sc.nextInt();
            //如果是旺季（5-10月）头等舱9折   经济舱8.5折
            if (month >= 5 && month <= 10) {
//                getPrice(ticket, i, 0.9,0.85);
                extracted(i, price, ticket, 0.9, 0.85);

            }
            //如果是淡季（11月-来年4月）头等舱7折   经济舱6.5折
            else {
                if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
//                    getPrice(ticket, i, 0.7,0.65);
                    extracted(i, price, ticket, 0.7, 0.65);
                }
            }
        } else {
            System.out.println("输入月份错误，请重新输入！");
        }
    }

    private static void extracted(int i, int price, int ticket, double x, double x1) {
        if (i == 1) {
            price = (int) (ticket * x);
            System.out.println("头等舱现价为：" + price);
        } else if (i == 2) {
            price = (int) (ticket * x1);
            System.out.println("经济舱现价为：" + price);
        } else {
            System.out.println("没有这个舱位");
        }
    }


   /* //将重复部分抽取成方法
    public static int getPrice(int ticket, int i, double v1, double v2) {
        int price = 0;
        if (i == 1) {
            price = (int) (ticket * v1);
            System.out.println("头等舱现价为：" + price);
        } else if (i == 2) {
            price = (int) (ticket * v2);
            System.out.println("经济舱现价为：" + price);
        }
        else {
            System.out.println("没有这个舱位");
        }

        return price;
    }*/
}


