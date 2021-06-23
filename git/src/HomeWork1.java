public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println ("\n задание №2");
        printThreeWords();
        System.out.println ("\n Задание №3");
        checkSumSign();
        System.out.println ("\n Задание №4");
        printColor();
        System.out.println ("\n Задание №5");
        compareNumbers();
    }

        public static void printThreeWords() {
            System.out.print ("\n Banana" + "\n Orange" + "\n Apple \n" );
        }

        public static void checkSumSign() {
        int a = -10;
        int b = 5;
        int c = a + b;
         if (c >= 0) {
             System.out.println ("Сумма положительная");
         } if (c <= 0) {
             System.out.println ("Сумма отрицательная");
            }
        }

        public static void printColor() {
        int value = 101;

         if (value <= 0) {
             System.out.println ("Red");
         } if (value > 0 && value <= 100) {
             System.out.println ("Yellow");
            } if (value > 100) {
             System.out.println ("Green");
            }
        }

        public static void compareNumbers() {
        int a = 7;
        int b = 5;
         if (a >=b ) {
             System.out.println ("a >= b");
         } else {
             System.out.println ("a < b");
         }
        }
    }

