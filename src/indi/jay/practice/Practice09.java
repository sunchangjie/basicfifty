package indi.jay.practice;

/**
 * @ClassName : Practice09
 * @Description : 求完数
 * @Author : Jay
 * @Date: 2020-02-25 20:22
 */
public class Practice09 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (i = 1; i <= 1000; i++) {
            int sum = 0;
            for (j = 1; j <= i - 1; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == j) {
                System.out.println(sum);
            }

        }
    }
}
