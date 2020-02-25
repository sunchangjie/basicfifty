package indi.jay.practice;

/**
 * @ClassName : Practice03
 * @Description : 水仙花数
 * @Author : Jay
 * @Date: 2020-02-24 19:01
 */
public class Practice03 {
    public static boolean isNarcLNum(int num) {
        // 个位数的立方 + 十位数的立方 + 百位数的立方 = num本身
        double calculatedVal = Math.pow(num % 10, 3) + Math.pow((num % 100) / 10, 3) + Math.pow(num / 100, 3);
        if (calculatedVal == (double) num) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        // 输出水仙花数
        for (int i = 100; i <= 999; i++) {
            if (isNarcLNum(i)) {
                System.out.println(i);
            }
        }


    }

}
