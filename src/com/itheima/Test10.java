package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*
         * 双色球系统
         * 生成6个红色球号码 1-33
         * 生成1个蓝色球号码1-16
         * */
       /* //分析
        //1.生成7个随机数  模拟中奖数字
        Random r = new Random();
        //一个数组记录红球
        int[] red = new int[6];

        //将生成的随机数放入数组中
        for (int i = 0; i < red.length; i++) {
            //怎么去掉0 ?
           int random= r.nextInt(34);
           red[i] = random;
        }
        for (int i = 0; i < red.length; i++) {
            System.out.print(red[i] + " ");
        }
        //一个数字记录蓝球
        int blue = r.nextInt(16);
        //2.用户输入自己的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的号码：");
        int number = sc.nextInt();
        int prize=0;
        //3.将两个数字进行比较 拼接数组为数字
        for (int i = 0; i < red.length; i++) {
             prize=prize*10+red[i];
        }*/


        //1.生成中奖号码
        int[] arr = creatNumber();
        System.out.println("============================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("============================");

        //2.用户输入中奖号码
        int[] userArr=userInputNumber();

        //3.将用户的彩票号码与中奖号码进行比较
        int redCount =0;
        int blueCount =0;
        //比较红球的号码
        //不用按顺序
        for (int i = 0; i < userArr.length-1; i++) {
            int redNumber=userArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]==redNumber){
                    redCount++;
                    //如果找到了，就没有必要继续比较了
                    //直接跳出循环比较下一个数字
                    break;
                }
            }
        }
        //比较蓝球的号码
        int blueNumber=userArr[userArr.length-1];
        if(arr[arr.length-1]==blueNumber){
            blueCount++;
        }
     if(redCount==6&&blueCount==1){
         System.out.println("恭喜你，中奖1000万元");
     }else if(redCount==6&&blueCount==0){
         System.out.println("恭喜你，中奖500万元");
     }else if(redCount==5&&blueCount==1){
         System.out.println("恭喜你，中奖3000元");
     }else if((redCount==5&&blueCount==0)||(redCount==4&&blueCount==1)){
         System.out.println("恭喜你，中奖200元");
     }else if((redCount==4&&blueCount==0)||(redCount==3&&blueCount==1)){
         System.out.println("恭喜你，中奖10元");
     }else if((redCount==2&&blueCount==1)||(redCount==1&&blueCount==1)||(redCount==0&&blueCount==1)){
         System.out.println("恭喜你，中奖5元");
     }
    }

    //用户输入中奖号码
    public static int[] userInputNumber() {
        //将红球号码和蓝球号码放到一个数组中
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        //将红球号码放到数组中
        for (int i = 0; i < arr.length - 1; ) {
            //输入红球号码
            System.out.println("请输入红球号码：");
            int redNumber = sc.nextInt();
            //判断红球号码取值范围
            if (redNumber >= 1 && redNumber <= 33){
                //判断红球号码唯一不重复
               boolean flag= contains(arr, redNumber);
               if (!flag){
                   arr[i] = redNumber;
                   i++;
               }else {
                   System.out.println("当前号码重复，请重新输入");
               }
            }else {
                System.out.println("输入的号码超出范围，请重新输入");
            }
        }
        //将蓝球号码放到数组中
        System.out.println("请输入蓝球号码：");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else {
                System.out.println("输入的号码超出范围，请重新输入");
            }
        }
        return arr;
    }

    //生成中奖号码
    public static int[] creatNumber() {
        //将红球号码和蓝球号码放到一个数组中
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            //生成红球号码
            int redNumber = r.nextInt(33) + 1;
            //红球号码不能重复
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }

        }
        //将蓝球号码放到数组中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //防止红球号码重复
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
