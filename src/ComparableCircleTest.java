import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(4.6);
        circles[2] = new ComparableCircle(2.8,"Blue", false);

        System.out.println("Pre - sorted: ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("After - sorted: ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }

}
