import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> apples1 = new ArrayList<>(List.of(new Apple(), new Apple(), new Apple()));
        List<Apple> apples2 = new ArrayList<>(List.of(new Apple(), new Apple(), new Apple(), new Apple()));
        List<Orange> oranges = new ArrayList<>(List.of(new Orange(), new Orange()));

        Box<Apple> appleBox1 = new Box<>(apples1);
        Box<Apple> appleBox2 = new Box<>(apples2);
        Box<Orange> orangeBox = new Box<>(oranges);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox);

        System.out.println(appleBox1.compare(orangeBox));
        System.out.println(appleBox2.compare(orangeBox));

        appleBox1.put(appleBox2);

        System.out.println(appleBox1);
        System.out.println(appleBox2);

    }
}