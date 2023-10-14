package Liste;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        List<parabola> lista=new ArrayList<parabola>();
        Scanner scanner =new Scanner(new File("src/lab3/intrari.txt"));
        do{
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            parabola p=new parabola(a,b,c);
            lista.add(p);
        }while(scanner.hasNext());
        for (parabola parabola : lista) System.out.println(parabola);
    }
}

