package learn.java;

import java.util.StringTokenizer;

/**
 * StringTokenizer
 */
public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer s1 = new StringTokenizer("Hello World, There is no one alive!");
        System.out.println("For s1 = new StringTokenizer(\"Hello World, There is no one alive!\")");
        while (s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }

        System.out.println();

        StringTokenizer s2 = new StringTokenizer("Hello World,There is no one alive!", ",");
        System.out.println("For s2 = new StringTokenizer(\"Hello World,There is no one alive!\")");
        while (s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }

        System.out.println();

        StringTokenizer s3 = new StringTokenizer("Hello World,There is no one alive!", ",", true);
        System.out.println("For s3 = new StringTokenizer(\"Hello World,There is no one alive!\")");
        while (s3.hasMoreTokens()){
            System.out.println(s3.nextToken());
        }
    }
}
