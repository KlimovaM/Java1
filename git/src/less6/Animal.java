package less6;
/*      1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
        собака 10 м.).
*/

public class Animal {
    private float maxRun; // максимальное расстояние для пробежки - кот 200м, пес 500м.
    private float maxSwim; // максимальный заплыв - кот не плывет, пес 10м.
//private String name;

    public Animal (float maxRun, float maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

    }

    public void run(float lengthMax) {
        if (lengthMax > maxRun) {
            System.out.println("Ограничение бега " + lengthMax + " метров");
            System.out.println("Максимальное расстояние: " + maxRun + " метров");
        } else {
            System.out.println("Животное пробежало " + lengthMax + " метров");
        }
    }

    public void swim(float lengthMax) {
        if(lengthMax > maxSwim) {
            System.out.println("Животное не может проплыть " + lengthMax);
            System.out.println("Максимальное расстояние:  " + maxSwim + " метров");
        }

        else {
            System.out.println("Животное проплыло " + lengthMax + " метров");
        }
        }
    }








