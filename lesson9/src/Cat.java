public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + "кот пробежал " + distance + " м.");
        } else {
            System.out.println(name + " кот не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " кот не умеет плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }
}