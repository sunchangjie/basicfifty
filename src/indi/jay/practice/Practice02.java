package indi.jay.practice;

/**
 * @ClassName : Practice02
 * @Description : 输出素数
 * @Author : Jay
 * @Date: 2020-02-24 18:42
 */
public class Practice02 {

    public static boolean isPrime(int num) {
        // 判断 传入的num 能不能被 3到num之间 的数整除
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
