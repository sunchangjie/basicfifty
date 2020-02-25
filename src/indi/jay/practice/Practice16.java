package indi.jay.practice;

/**
 * @ClassName : Practice16
 * @Description : 输出 9*9 表
 * @Author : Jay
 * @Date: 2020-02-25 16:14
 */
public class Practice16 {

    public static void main(String[] args) {

        // 嵌套循环输出9*9乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i >= j) {
                    System.out.print(i + "X" + j + "=" + i * j + "\t");
                }
            }
            // 换行符 注意区分 print和println
            System.out.println();
        }
    }
}
