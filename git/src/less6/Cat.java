package less6;

public class Cat extends Animal{
    public Cat(float maxRun) {
        super(maxRun, Integer.MIN_VALUE);
    }

    //@Override //?
    public void swim(float lengthMax) {
        System.out.println("Котики не плавают :(");
    }
}
