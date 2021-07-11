package less5;

/*      1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        4. Создать массив из 5 сотрудников.
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

public class Worker {  // класс с данными сотрудника
    private String fullName;
    private String position;
    private String mail;
    private String phoneNumber; // int numberPhone ?
    int theSalary;
    int age;

    public Worker (String fullName, String position, String mail,String phoneNumber, int theSalary, int age) {  //конструктор класса
        this.fullName = fullName;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.theSalary = theSalary;
        this.age = age;

    }

    public void outPrint() { //метод для вывода информации в консоль
        System.out.println("ФИО " + fullName);
        System.out.println("Должность " + position);
        System.out.println("email " + mail);
        System.out.println("Номер телефона " + phoneNumber);
        System.out.println("ЗП " + theSalary);
        System.out.println("Возраст " + age);
    }

}



