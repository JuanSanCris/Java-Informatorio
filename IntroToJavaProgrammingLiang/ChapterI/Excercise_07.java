package IntroToJavaProgrammingLiang.ChapterI;

/* (Approximate pi) pi can be computed using the following formula:
p = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
Write a program that displays the result of the operation. Use 1.0 instead of 1 in your
program. */

public class Excercise_07 {
    public static void main(String[] args) {
        System.out.println("pi approximation without decimals = " + (4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)));
        System.out.println("pi approximation with decimals = " + (4.0 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11)));
    }
}
