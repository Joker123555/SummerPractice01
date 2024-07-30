package com.itheima;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*需求
         * 数字加密
         * 先得到每位数  每位数都加上5  再对10取余  最后将数字反转
         * */

        //分析
        //1.把整数的每一位都放到数组中去
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
        int[] passwords = new int[count];
        //解决数组反着存的问题
        int index = count - 1;
        while (number2 != 0) {
            //取出密码的个位
            int ge = number2 % 10;
            //再去掉密码的个位
            number2 = number2 / 10;
            //将个位放到数组中
            passwords[index] = ge;
            index--;
        }

        int[] password = new int[count];
        for (int i = 0; i < passwords.length; i++) {
            /*//1.键盘录入密码  将密码放到数组中
            passwords[i] = sc.nextInt();*/
            //2.将数组中的数字加5  再对10取余
            password[i] = (passwords[i] + 5) % 10;
        }
        System.out.println("进行计算后的数字为：");
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i] + " ");

        }
        System.out.println();

       /* for (int i = 3; i < password.length && i >= 0; i--) {

            System.out.print(password[i] + " ");
        }
*/
        //3.将数组中的数字反转
        //用排序的方法进行反转
        for (int i = 0, j = password.length - 1; i < j; i++, j--) {
            int temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }
        System.out.println("进行反转后的数字为：");
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i] + " ");
        }
        System.out.println();
        //将得到的数字拼接起来
        System.out.print("拼接后的最终密码为：");
        int number3 = 0;
        for (int i = 0; i < password.length; i++) {
            number3 = number3 * 10 + password[i];
        }
        System.out.println(number3);
    }
}
