package indi.jay.practice;

import java.util.Scanner;

/**
 * @ClassName : Practice08
 * @Description : 输入数字求和
 * @Author : Jay
 * @Date: 2020-02-25 20:22
 */
public class Practice08 {
    public static void main(String[] args) {
        //提示用户输入1--9之间的数字
        System.out.println("请输入1-9之间的数字：");
        Scanner sc = new Scanner(System.in);
        //接受用户输入的数字作为题目中的“基数”
        int shu = sc.nextInt();
        //定义一个变量a等于用户输入的数。
        int a = shu;
        //定义变量作为数字相加的和
        int sum = 0;
        //提示用户输入需要相加的个数
        System.out.println("请输入相加的个数：");
        int jishu = sc.nextInt();
        //如果用户输入的是1--9之间的数
        if (shu > 0 && shu < 10) {
            //先不换行输出用户输入的“基数”
            System.out.print(shu + " ");
            //用循环依次输出第二个数到最后一个数
            for (int i = 1; i < jishu; i++) {
                //从第二个数开始到最后一个数的每个数的值
                shu = a + shu * 10;
                //从第二个数开始到最后一个数的和
                sum += shu;
                System.out.print(shu + " ");
            }
            //因为sum从第二个数开始的和，输出的时候要加上第一个数
            System.out.println("的和是" + (sum + a));
        }
        //用户输入的不是1--9之间的数
        else {
            System.out.println("请输入1-9之间的数");
        }
    }
}

