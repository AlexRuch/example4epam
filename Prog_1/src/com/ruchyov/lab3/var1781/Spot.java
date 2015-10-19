package com.ruchyov.lab3.var1781;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by alexey on 30/09/15.
 */
public class Spot {
    private String x, y;

       private ArrayDeque<Dots> dots = new ArrayDeque<Dots>();


    public void Spot() throws IOException{
        Scanner sc = new Scanner(new InputStreamReader(System.in));


       System.out.println("Укажите полный путь до файла с точками и его расширение:");
        String pwd_dots = sc.nextLine();

        Silhuette silhuette  = new Silhuette();

        System.out.println("Enter R:");
        Double R = sc.nextDouble();

        Scanner dots_sc = new Scanner(new File(pwd_dots));
        int j = 1;
        int g = 2;
        int i = 0;

        while (dots_sc.hasNext()){

            String line = dots_sc.nextLine();
            String[] dots_arr = line.split("[\\s,;\\[\\]]+");
            while (i < dots_arr.length/2){
                //writer.write(dots_arr[i] + '\n');
                //writer.flush();

               if (i%2 != 0 || i == 0 ){
                   x = dots_arr[j];
                   y = dots_arr[g];
               }
               else{
                   x = dots_arr[j];
                   y = dots_arr[g];
               }

                dots.add(new Dots(x, y));

                i++;
                j = j+2;
                g = g +2;
            }
        }

        for (Dots sdt : dots){
           silhuette.silhuette(sdt.getSx(), sdt.getSy(), R);
        }
    }
}
