import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Scanner;
public class MyApplication {
    public static void main(String... args) throws FileNotFoundException {
        File file = new File("/Users/adiletseilkanov/IdeaProjects/Assignment1_Seilkanov_Adilet/src/source");
        //присваиваем файл в переменную
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while(sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point(x,y);
            shape.addPoint(point);
            shape.toString();
        }

        System.out.println(shape.toString()); //print toString
    }
}