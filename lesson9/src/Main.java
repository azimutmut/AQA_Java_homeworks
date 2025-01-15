public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");

        cat1.run(150);
        cat1.swim(5);

        dog1.run(400);
        dog1.swim(5);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Кошек: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
    }
}