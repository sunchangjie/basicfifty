package indi.jay.practice;

/**
 * @ClassName : Practice10
 * @Description : 自由落体
 * @Author : Jay
 * @Date: 2020-02-25 15:46
 */
public class Practice10 {
    public static void main(String[] args) {
        // 初始高度
        final int INITIAL_HEIGHT = 100;
        // 弹跳次数
        final int TIMES = 10;
        // 总的弹跳距离
        float distanceAll = 0;
        // 当前弹跳次数对应弹跳距离
        float distanceThisTime = INITIAL_HEIGHT;

        for (int i = 0; i < TIMES; i++) {
            distanceThisTime = distanceThisTime / 2;
            distanceAll = distanceAll + distanceThisTime;
            System.out.println("第" + (i + 1) + "次弹跳，距离为" + distanceThisTime);
        }
        System.out.println(distanceAll);
    }
}
