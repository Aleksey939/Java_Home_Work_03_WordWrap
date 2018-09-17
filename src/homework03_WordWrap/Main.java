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

                if (line.length() >= 60) {
                  int i=0;
                  int j=60;
                    while(line!=null){

                    String line2 = line.substring(i,j);
                    i=i+60;
                    if (i>line.length()-60)
                        j=line.length();
                    else
                    j=i+60;
                    textlist.add(line2);}
                }
                else {
                    textlist.add(line);
                }
                System.out.println(line);
            }

        }
    }

