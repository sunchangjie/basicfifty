package indi.jay.practice;

/**
 * @ClassName : Practice02
 * @Description : 输出素数
 * @Author : Jay
 * @Date: 2020-02-24 18:42
 */
public class Practice02 {

    public static boolean isPrime(int num) {
        // 判断能不能被整除
        for (int j = 3; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        // 输出素数
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
