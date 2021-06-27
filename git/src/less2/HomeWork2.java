package less2;

public class HomeWork2 {

    public static void main (String[] agrs) {
        System.out.println ("Задание №1");
        System.out.println (summ(10,6));
        System.out.println ("Задание №2");
        checkNegativ (-3);
        System.out.println ("Задание №3 \n" + checkNumber(-8));

        System.out.println ("Задание №4");
        printTxt ();
        printTxt2 ("Hello ", 20);

        System.out.println ("Задание №5 \n" + year (100));
     //   year (2000);
        System.out.println ("Задание №5 \n" + year2 (100));


    }

/*  1 Написать метод, принимающий на вход два целых числа и проверяющий,
 что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false. */
    public static boolean summ(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
}

/* 2 Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
 */
    public static void checkNegativ( int a) {
        if (a >= 0) {
            System.out.println("Позитивное число");
        } else {
            System.out.println("Негативное число");
        }
    }
/*  3 Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */
    public static boolean checkNumber(int v) { return v <= 0; }


/*  4  Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
     public static void printTxt () {
        for (int i = 0; i < 5; i++) {
                System.out.print ("text ");
            } System.out.println();
        }

    public static void printTxt2 (String word, int numb) {
        for (int i = 0; i < numb; i++) {
            System.out.print (word);
        } System.out.println();
    }

/* 5 * Написать метод, который определяет, является ли год високосным,
и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

    public static boolean year (int y) {
        if (y % 4 == 0 && y % 400 == 0) {
            return true;
        }
       // if (y % 400 == 0) {
       //     return true;
       // }
        if (y % 100 != 0) { return false;}
        else {
            return false;
        }
    }

   // public static boolean year (int y) {
   //     return y % 4 == 0 && y % 100 != 0 && y % 400 == 0;
   // }

    public static boolean year2 (int y) {
        return y % 4 == 0 && y % 400 == 0 || y % 100 != 0;
    }







}
