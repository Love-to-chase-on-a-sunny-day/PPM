package com.qingtian.game;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class game {
    public static void main(String[] args) throws IOException {


        String best = "255";
        best += "\r\n";

        System.out.println("请输入你要生成PPM文件的name");
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println("请输入长");
        int chang = sc.nextInt();
        System.out.println("请输入宽");
        int kuan = sc.nextInt();
        System.out.println("请输入颜色仅限一个关键词,最大值为255");
        String color = sc.next();
        String name = n + ".PPM";


        String COLORC = color + " " + color + " " + color + " ";
        String zong = "";
        for (int i = 0; i < chang * kuan; i++) {
            zong = zong + COLORC;
        }


        filewritemethod("G:/JAVA PROJECT/PPM Generator/PPM_Generator/PPM/" + name, "P3" + " " + chang + " " + kuan + " " + best +zong);


    }

    public static void filewritemethod(String filepath, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filepath)) {
            fileWriter.append(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("创建成功");
    }

}
