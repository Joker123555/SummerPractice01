package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*需求：评委打分
         * 6名评委在[0-100]整数 打分
         * 最后得分 去掉最高分，去掉最低分
         * 去剩下4个评委的平均分为最终得分
         * */
      /*  //分析
        //1.生成6个 1-100 的随机数放到一个数组中
        int[] grade1 = new int[6];
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int number = r.nextInt(101);
            grade1[i]=number;
        }
        //2.遍历数组，找到最高分和最低分 将他们去掉后再生成一个新数组
        //新数组
        int[] grade2=new int[4];
        // 遍历
        for (int i = 0; i < 6; i++) {
            for (int j = i+1;  j< 6; j++) {
                if (grade1[i]>grade1[j]) {
                    grade2[i]=grade1[j];
                }
            }
        }

        //3.利用遍历和平均数计算求出最终得分*/
/*-----------方法一----------------------
        //分析
        //1.键盘录入6个分数，放到数组中
        int[] grade1 = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入评委的分数: ");
            int score= sc.nextInt();
            if (score >= 0 && score <= 100) {
                grade1[i] = score;
                i++;
            }else{
                System.out.println("成绩超出范围，请重新录入：");
            }
        }
        //遍历
        System.out.println("6个评委的分数为：");
        for (int i = 0; i < 6; i++) {
            System.out.print(grade1[i]+" ");
        }
        //2.求出最大值
        int max = grade1[0];
        for (int i = 0; i < 6; i++) {
            if (grade1[i] > max) {
                max = grade1[i];
            }
        }
        System.out.println("最大值为："+max);
        //3.求出最小值
        int min = grade1[0];
        for (int i = 0; i < 6; i++) {
            if (grade1[i] < min) {
                min = grade1[i];
            }
        }
        System.out.println("最小值为："+min);

        //4.  （总和-最大值-最小值）/ 4 求出最终得分
        int score = 0;
        for (int i = 0; i < 6; i++) {
            score += grade1[i];
        }
        score=(score-min-max)/4;
        System.out.println("最终分数为："+score);*/
//------------------------方法二-----------------------------------------
        int[] scores = new int[6];
        int score = 0;
        getScores(scores);
//打印成绩
        for (int i = 0; i < 6; i++) {
            System.out.print(scores[i]+" ");
            score=score+scores[i];
        }
//获取最大值

        score=(score-getMax(scores)- getMin(scores))/4;
        System.out.println("最终成绩为：" +score);


    }
    //将评委的成绩存入数组中
    public static int[] getScores(int[] scores){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请评委输入成绩: ");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            }else {
                System.out.println("成绩超出范围，请重新录入：");
            }
        }
        return scores;
    }
    //获取最大值
    public static int getMax(int[] scores){
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    //获取最小值
    public static int getMin(int[] scores){
            int min = scores[0];
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] < min) {
                    min = scores[i];
                }
            }
            return min;
    }

}
