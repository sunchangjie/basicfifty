package indi.jay.practice;

/**
 * @ClassName : Practice11
 * @Description : 根据条件求数字
 * @Author : Jay
 * @Date: 2020-02-25 15:59
 */
public class Practice13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            double v1 = (Math.sqrt(i + 100F)) % 1;
            double v2 = (Math.sqrt(i + 268F)) % 1;
            if (v1 == v2) {
                System.out.println(i);
            }
        }
    }
}
