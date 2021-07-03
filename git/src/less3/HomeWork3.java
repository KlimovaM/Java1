package less3;

public class HomeWork3 {
    public static void main (String[] agrs) {

   //     int [] arr1 = new int[1, 1, 0, 0, 1, 0, 1, 1, 0, 0];


        System.out.println("Задание №1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeNumb (arr1);
        System.out.println("\nЗадание №1/1");
        changeNumb2 (arr1);
        arrHelp("Верни массив",arr1);


        System.out.println("\nЗадание №2");
        int[] arr2 = new int[100];
        wtiteArr(arr2);
        System.out.println("\nЗадание №2/2"); //не забывать про вспомогательные массивы!!
        wtiteArr2(arr2);
        arrHelp("Верни массив",arr2);




        System.out.println("\nЗадание №3");
        int[] arr3 =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        change6(arr3);
        System.out.println("\nЗадание №3/3");
      //  change62(arr3);
        arrHelp("Верни массив",arr3);

        System.out.println("\nЗадание №4");
        int[][] arr4 = new int[3][3];
        printOne(arr4);

        System.out.println("\nЗадание №5");

        int[] writeReturn = printArr5(10,8);
        arrHelp("Верни массив", writeReturn );

        System.out.println("\nЗадание №6");
        int[] arr6 = {1, 5, 8, 12, 4, 11, 9, 0};
        arrHelp("Найди минимум", arr6);
        System.out.println("\nmin = " + findMin(arr6)); // сравнивает значения, если знач меньше или равно мин, напечатать его
        System.out.println("max = " + findMax(arr6)); //аналогично предыдущ. в большую сторону


        System.out.println("\nЗадание №7");
        int[] arr7 = {1, 1, 1, 1, 1, 1, 5};
        checkBalance(arr7);
        System.out.println(checkBalance(arr7));

        System.out.println("\nЗадание №8");

     //   printArr6(arr6);



    }

    public static void arrHelp (String msg, int[] printArr) { // вспомогательный метод для печати одномерного массива
        for (int i = 0; i < printArr.length; i++) {
            System.out.print(printArr[i] + " ");
        }
    }

/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    public static void changeNumb (int[] arr1) {
       // int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {System.out.print(1 + " ");
            } else {System.out.print(0 + " ");
            }
        }
    }
    public static void changeNumb2 (int[] arr1) { //для печати этого метода необходим вспомогательный метод
        // int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {arr1[i] = 0;
            } else {arr1[i] = 1;
            }
        }
    }



/* 2. Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
    public static void wtiteArr (int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + 1 + " ");
        }
    }

    public static void wtiteArr2 (int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (i + 1);
        }
    }


/* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
 */
    public static void change6 (int[] arr3) {
        for (int i = 0; i < arr3.length; i++)
            if (arr3[i] <= 6) {
                arr3[i] *= 2;
                System.out.print(arr3[i] + " ");
            } else {System.out.print(arr3[i] + " "); }
    }

    public static void change62 (int[] arr3) {
        for (int i = 0; i < arr3.length; i++)
        {
            arr3[i] = (arr3[i] < 6) ? (arr3[1] * 2) : arr3[i];
        }
    }




/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], …, [n][n];
 */
 /*   public static void printOne(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print ("* ");
            } System.out.println(" ");
        }
    }

  */

/*    public static void printOne(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j) {
                    System.out.print("1");
                } else {
                    System.out.print("*");
                } //System.out.println(" ");
            }
        }
    }
 */

 /*   public static void printOne(int[][] arr4) {   //это конечно сложно далось, я гуглила
        for (int i = 0; i < arr4.length; i++) {  // хм, подойдет только для размера 3х3 :((
            for (int j = 0; j < arr4.length; j++) {
                if (i == j || j == i - 2 || j == i + 2) arr4[i][j] = 1;
                System.out.print(arr4[i][j]);
            } System.out.println();
        }
    }

  */


    public static void printOne(int[][] arr4) {   //это конечно сложно далось, я гуглила
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j) arr4[i][j] = 1;
                System.out.print(arr4[i][j]);
            } System.out.println();
        }
    }




/* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 */



    public static int[] printArr5(int len, int initialValue ) {
        int[] arrLen = new int[len];

        for (int i = 0; i < arrLen.length; i++) {
            arrLen[i] = initialValue;
        }
        return arrLen;
    }





/* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 */
    public static int findMin (int[] minArr) {
            int min = minArr[0];
        for(int i = 0; i < minArr.length; i++) {
            if (minArr[i] <= min) {
                min = minArr[i];
            }

        }
        return min;
    }

    public static int findMax (int[] maxArr) {
        int max = maxArr[0];
        for(int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] >= max) {
                max = maxArr[i];
            }

        }
        return max;
    }



/* 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
**Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 */
public static boolean checkBalance(int[] arr7) {
    int r = 0, l = 0;
    for (int i = 0; i < arr7.length - 1; i++) {
        l += arr7[i];
        for (int j = i + 1; j < arr7.length; j++)
            r += arr7[j];
        if (l == r) return true;
        r = 0;
    }
    return false;
}


/* 8. *** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
 Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
 [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */



}

