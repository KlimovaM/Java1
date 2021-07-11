package less5;



public class Main {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivanov Ivan Ivanovich", "director", "ivanov@mail.ru", "+123456789", 100000, 50);
        workers[1] = new Worker("Ivanova Anna Nikolaevna", "accountant", "ivanovaa@mail.ru", "+234567890", 80000, 55);
        workers[2] = new Worker("Petrov Sergey Ivanovich", "lead engineer", "petrov@mail.ru", "+345678901", 80000, 50);
        workers[3] = new Worker("Nikolaev Ilia Vasilevich", "engineer", "nikolaev@mail.ru", "+456789012", 60000, 30);
        workers[4] = new Worker("Kostin Leonid Dmitrievich", "junior engineer", "kostin@mail.ru", "+567890123", 40000, 25);


    int minAge = 40;
    for (Worker worker : workers)

    {
        if (worker.age > minAge) {
            worker.outPrint();
            System.out.println();
        }
    }
    }
}







