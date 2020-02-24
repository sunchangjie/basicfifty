package indi.jay.practice;

/**
 * @ClassName : Practice05
 * @Description : 判断分数等级
 * @Author : Jay
 * @Date: 2020-02-24 19:19
 */
public class Practice05 {

    static final String GRADEA = "A";
    static final String GRADEB = "B";
    static final String GRADEC = "C";

   public static String getGrade(int score){
       return (score>=90)?GRADEA:((score>=60)?GRADEB:GRADEC);
    };

    public static void main(String[] args) {

        int score = 70;
        System.out.println(getGrade(score));

    }

}
