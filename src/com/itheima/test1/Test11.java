package com.itheima.test1;

public class Test11 {
    public static void main(String[] args) {
        //二维数组练习
        /*计算营业额
         * 第一季度： 22,66,44
         * 第二季度： 77,33,88
         * 第三季度： 25,45,65
         * 第四季度： 11,66,99
         *
         * 要求计算出每个季度的总营业额和全年的总营业额
         * */
        //1.创建二维数组
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        //2.计算总营业额
        int yearSum=0;
        for (int i = 0; i < yearArr.length; i++) {
            int[] arr = yearArr[i];
            int sum = getSum(arr);
            System.out.println("第"+i+"个季度的总营业额为："+sum);
            yearSum=yearSum+sum;
        }
        System.out.println("全年的总营业额为："+yearSum);
    }

    //创建方法计算每个季度的总营业额
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
