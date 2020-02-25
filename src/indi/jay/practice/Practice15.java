package indi.jay.practice;

/**
 * @ClassName : Practice16
 * @Description : 排序
 * @Author : Jay
 * @Date: 2020-02-25 16:14
 */
public class Practice15 {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        int z = 8;

        int temp;
        if (x > y) {
            temp = y;
            y = x;
            x = temp;
        }

        if (x > z) {
            temp = z;
            z = x;
            x = temp;
        }

        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }

        System.out.println("从小到大依次是：" + x + "，" + y + "，" + z);

    }
}
