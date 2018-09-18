//        Напишите метод, с названием WordWrap, который принимает Scanner, представляющий входной файл в качестве параметра и
//        выводит каждую строка файла на консоль, при чем длинна строки не должна превышать 60 символов.
//
//        Например, если строка содержит 112 символов, метод должен заменить его на две строки: одна из которых содержит
//        первые 60 символов, а другая содержащая последние 52 символов.
//
//        Строка, содержащая 217 символов должны быть преобразована в четыре строки: три длиной 60 и последняя строка длиной 37
package homework03_WordWrap;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        File file = new File("text.txt");

        Scanner sc = null;

        try {

            sc = new Scanner(file);
            WordWrap(sc);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } finally {
            sc.close();

        }
    }
    public static void WordWrap(Scanner scanner) {

        List<String> textlist = new ArrayList<String>();
        Scanner sc = scanner;



            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                int lenght=line.length();
                if (lenght >= 60) {
                  int i=0;
                  int j=60;
                    while(lenght>=j&&i<j){


                            String line2 = line.substring(i, j);

                            textlist.add(line2);

                            i = i + 60;
                            if (i > lenght - 60)
                                j = lenght;

                            else
                                j = i + 60;

                   }
                }
                else {
                    textlist.add(line);
                }

            }
            for (String s:textlist)
                System.out.println(s);

        }
    }

