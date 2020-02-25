package indi.jay.practice;

/**
 * @ClassName : Practice05
 * @Description : 判断分数等级
 * @Author : Jay
 * @Date: 2020-02-24 19:19
 */
public class Practice05 {

    static final String GRADE_A = "A";
    static final String GRADE_B = "B";
    static final String GRADE_C = "C";

   public static String getGrade(int score){
       return (score>=90)?GRADE_A:((score>=60)?GRADE_B:GRADE_C);
    };

    public static void main(String[] args) {

        int score = 70;
        System.out.println(getGrade(score));

    }

}
