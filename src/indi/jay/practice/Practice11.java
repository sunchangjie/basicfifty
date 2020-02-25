package indi.jay.practice;

/**
 * @ClassName : Practice11
 * @Description : 求不重复数字
 * @Author : Jay
 * @Date: 2020-02-25 15:59
 */
public class Practice11 {
    public static void main(String[] args) {
        int i;//保存到百位上的数字
        int j;//保存到十位上的数字
        int k;//保存到个位上的数字
        int t = 0;//保存数字的个数
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        t += 1;
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
        System.out.println("总共能够组成" + t + "个数字！");
    }

}
