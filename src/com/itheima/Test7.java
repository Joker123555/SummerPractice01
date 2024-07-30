package com.itheima;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*需求
        * 解密Test6
        * 将得到的加密结果，先反转
        * 再分析怎么逆操作%10
        * 再减5
        * */
        //分析
        //1.先将密码放到数组中
        System.out.print("请输入密码: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = number;
        int count = 0;
        //获取密码的位数
        while (number > 0) {
            //（1）每循环一次就去掉右边的一位
            number = number / 10;
            count++;
        }
        //（2）通过循环将整数放到数组中
        //获取密码的每一位数字
        int[] arr = new int[count];
        //解决数组反着存的问题
        int index = count - 1;
        while (number2 != 0) {
            //取出密码的个位
            int ge = number2 % 10;
            //再去掉密码的个位
            number2 = number2 / 10;
            //将个位放到数组中
            arr[index] = ge;
            index--;
        }
        //2.将数组中的数字反转
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //打印arr检查一下
        System.out.println("反转后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //3.逆操作%10
        for (int i = 0; i < arr.length; i++) {
            //3.1 分析出当加5之后   最小值为5   最大值为14
            //3.2 当数字<5时 +10  当数字>=5 时保持不变
            if (arr[i]<5) {
                arr[i]=arr[i]+10;
            }
        }
        //4.将数字减5
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-5;
        }
        //打印arr检查一下
        System.out.println("计算后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //5.将数组再拼成数字
        int number3=0;
        for (int i = 0; i < arr.length; i++) {
            number3=number3*10+arr[i];
        }
        //打印解密后的结果
        System.out.println("解密后的结果为："+number3);
    }
}
