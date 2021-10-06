package Homework20;

import java.io.File;

public class testing {
    public static void main(String[] args) {
        File myfile = new File("data\\words.txt");
        File myfile1 = new File("input\\words.txt");
        System.out.println(myfile.getAbsolutePath());
        System.out.println(myfile.exists());
        System.out.println(myfile1.getAbsolutePath());
        System.out.println(myfile1.exists());
    }
}
