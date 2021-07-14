package less6;

public class Main {
    public static void main (String[] args) {
      //  Animal animal = new Animal;

        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        cat.run(100);
        cat.swim(0);

        dog.run(50);
        dog.swim(800);

    }
}
