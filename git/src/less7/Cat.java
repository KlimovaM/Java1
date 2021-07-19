package less7;
/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */



public class Cat {

    private boolean fullCat;
    private int hungry;
    private String name;

    public Cat(int appetite, String name) {
        fullCat = false;
        this.hungry = hungry;
        this.name = name;
    }

    public void eat(Food plate)
    {
        if (plate.catsFood(hungry) && !fullCat)
        {
            System.out.println("Котик " + name + " кушает.");
            plate.noFood(hungry);
            fullCat = true;
        }
        else if (!plate.catsFood(hungry))
        {
            System.out.println("Котик " + name + " гипнотизирует и выпрашивает еду.");
        }
        else if (fullCat)
        {
            System.out.println("В котика " + name + " столько не влезает.");
        }
    }


}