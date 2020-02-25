package indi.jay.practice;

/**
 * @ClassName : Practice12
 * @Description : 计算奖金
 * @Author : Jay
 * @Date: 2020-02-25 19:20
 */
public class Practice12 {

   static long calculateBonus(long profit){

       long[] profitInterval = new long[]{0,100000,200000,400000,600000,1000000};
       float[] ratio = new float[]{0f,0.1f,0.075f,0.05f,0.03f,0.015f,0.01f};

       // 奖金初始值为0
       float bonus = 0;
       //判断区间
       for(int i = profitInterval.length;i>0;i--){
            if (profit > profitInterval[i-1]){
                bonus = bonus + (profit - profitInterval[i-1])* ratio[i];
                profit = profitInterval[i-1];
            }
       }
       return (long)bonus;
    }


    public static void main(String[] args) {
        // 利润
        long profit = 1000001;

        System.out.println(calculateBonus(profit));
    }

}
