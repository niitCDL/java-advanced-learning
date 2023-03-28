package top.advanced.scanner;

import java.util.Scanner;

public class GetBodyFat {
    public static void main(String[] args) {
        // 初始化腰围
        float waistline = 0f;
        // 初始化体重
        float weight = 0f;
        // 声明浮点型参数a，b，bodyFatWeight（脂肪重量）
        float a, b, bodyFatWeight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的腰围（cm）：");
        if (scanner.hasNextFloat()) {
            waistline = scanner.nextFloat();
        }
        System.out.println("请输入您的体重（kg）：");
        if (scanner.hasNextFloat()) {
            weight = scanner.nextFloat();
        }
        // 计算参数a  公式：参数a = 腰围（cm）× 0.74
        a = waistline * 0.74f;
        // 计算参数b  公式：参数b = 体重（kg）× 0.082 + 44.74
        b = weight * 0.082f + 44.74f;
        // 计算脂肪重量
        bodyFatWeight = a - b;
        // 计算体脂率 =（脂肪重量 ÷ 体重）×100%。
        float result = bodyFatWeight / weight * 100;
        System.out.println("您的体脂率为" + result + "%");
    }
}
