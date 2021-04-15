package learn.java;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str = new String("Hello World, there is no one alive!");
        System.out.println(Arrays.toString(str.split(" ")));

        String str2 = "Hello World, there is no one alive!";
        String[] str2Array = str2.split(", ");
        for (String s: str2Array) {
            System.out.println(s);
        }
    }
}
