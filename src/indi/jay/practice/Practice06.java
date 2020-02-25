package indi.jay.practice;

/**
 * @ClassName : Practice06
 * @Description : 求最大公约数及最小公倍数
 * @Author : Jay
 * @Date: 2020-02-24 19:45
 */
public class Practice06 {
    //最大公约数
    public static int getMaxDivisor(int num1, int num2) {
        //求出两个数字之间的小值
        int min = num1 < num2 ? num1 : num2;
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    //最小公倍数
    public static int getMinMultiple(int num1, int num2) {
        if (num1 < num2) {
            int t = num1;
            num1 = num2;
            num2 = t;
        }
        for (int i = num2; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 56;

        if (getMaxDivisor(num1, num2)==1) {
            System.out.println("没有最大公约数是");
        }else{
            System.out.println("最大公约数是：" + getMaxDivisor(num1, num2));
        }
        System.out.println("最小公倍数：" + getMinMultiple(num1, num2));

    }
}
