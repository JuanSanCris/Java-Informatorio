package IntroToJavaProgrammingLiang.ChapterI;



public class Excercise_13 {
    public static void main(String[] args) {
        System.out.println("equation 1:  3.4x + 50.2y = 44.5");
        System.out.println("equation 2:  2.1x + 0.55y = 5.9");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("x = ed - bf / ad - bc");
        System.out.println("y = af - ec / ad - bc");
        System.out.println("x = " + ((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1)));
        System.out.println("y = " + ((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1)));

    }
}
