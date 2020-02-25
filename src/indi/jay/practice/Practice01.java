package indi.jay.practice;

/**
 * @ClassName : Practice1
 * @Description : 不死神兔
 * @Author : Jay
 * @Date: 2020-02-24 18:33
 */
public class Practice01 {

    public static int calculate(int monthNum) {
        if (monthNum == 1 || monthNum == 2) {
            return 1;
        } else {
            return calculate(monthNum - 1) + calculate(monthNum - 2);
        }
    }

    public static void main(String[] args) {
        // 输出1-10月份的兔子数量
        for (int monthNum = 1; monthNum < 10; monthNum++) {
            // 兔子数量
            int rabbitNum = calculate(monthNum);
            System.out.println(rabbitNum);
        }
    }


}
