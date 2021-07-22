package less8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);

        setLocation(500, 200);
        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton but1 = new JButton("Exit");

        ActionListener listener = new CloseActionListener();
        but1.addActionListener(listener);
       // add(but1, BorderLayout.SOUTH);
        panel.add(but1);

        JButton but2 = new JButton("button2");
       // add(but2, BorderLayout.NORTH);
        panel.add(but2);

        add(panel, BorderLayout.SOUTH);

        Scanner myScanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
/*
        //загадываем слово
        String selectedWord = words [(int)Math.floor(Math.random() * words.length)]; //words.length()
        System.out.println("Загадайте одно из слов: \"apple\", \"orange\", \"lemon\", \"banana\"," +
                " \"apricot\", \"avocado\", \"broccoli\", \"carrot\", " +
                "\"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", " +
                "\"mushroom\", \"nut\", \"olive\", \"pea\", \"peanut\", \"pear\", \"pepper\", \"pineapple\"," +
                " \"pumpkin\", \"potato\"");
        System.out.println(Arrays.toString(words)); //слова
        String myAttempt;
        StringBuilder lettersInPlace;
        do {
            System.out.println("Загаданное слово");
            myAttempt = myScanner.nextLine();
            if (Objects.equals (myAttempt, selectedWord)) {
                System.out.println ("Верно!");
            } else {
                lettersInPlace = new StringBuilder("********");
                int shortestWordLenght;
                if (selectedWord.length() < myAttempt.length()) {
                    shortestWordLenght = selectedWord.length();
                } else {
                    shortestWordLenght = myAttempt.length();
                }
                for (int i = 0; i < shortestWordLenght; i++) {
                    if (myAttempt.charAt(i) == selectedWord.charAt(i));
                }
            }
            System.out.println("Неправильно, подсказка: ");
            System.out.println ("Подсказка" + lettersInPlace); //()
            System.out.println("Еще раз ");
        } while (!Objects.equals(myAttempt, selectedWord));

 */
    }
}

