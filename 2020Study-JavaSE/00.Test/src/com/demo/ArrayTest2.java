package com.demo;

import java.util.Scanner;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-08 21:10
 * @Description: 尚硅谷 宋红康 java 152集 练习
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数:");
        int studentNumber = scan.nextInt();
        System.out.println("请输入" + studentNumber + "个成绩");
        int[] scores = new int[studentNumber];
        char[] scoreGrades = new char[studentNumber];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }
        int maxScore = calMaxScore(scores);
        System.out.println("最高分是：" + maxScore);
        for (int i = 0; i < scores.length; i++) {
            scoreGrades[i] = judgeScoreGrade(maxScore, scores[i]);
            System.out.println("student " + i + " score is " + scores[i] + " grade is " + scoreGrades[i]);
        }
    }

    /**
     * @param arr 要求最大值的int数组
     * @return int数组的最大值
     */
    private static int calMaxScore(int[] arr) {
        int maxScore = 0;
        for (int value : arr) {
            if (value > maxScore) {
                maxScore = value;
            }
        }
        return maxScore;
    }

    /**
     * @param maxScore 最大值
     * @param score    和最大值比较的值
     * @return 成绩等级
     */
    private static char judgeScoreGrade(int maxScore, int score) {
        if (score >= maxScore - 10) {
            return 'A';
        } else if (score >= maxScore - 20) {
            return 'B';
        } else if (score >= maxScore - 30) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
