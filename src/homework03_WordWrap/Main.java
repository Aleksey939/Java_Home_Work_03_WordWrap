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
                if (line.length() >= 60) {
                  int i=0;
                  int j=60;
                    while(lenght>j){

                    String line2 = line.substring(i,j);
                    textlist.add(line2);

                    i=i+60;
                    if (i>lenght-60)
                        j=lenght;
                    else
                    j=i+60;
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

