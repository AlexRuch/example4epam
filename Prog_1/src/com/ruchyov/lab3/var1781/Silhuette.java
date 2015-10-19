package com.ruchyov.lab3.var1781;

import java.io.IOException;

/**
 * Created by alexey on 30/09/15.
 */
public class Silhuette {

    Double Dx, Dy;


    public void   silhuette(String x, String y, Double  R) throws IOException {

        Dx = Double.valueOf(x);
        Dy = Double.valueOf(y);

        //Check first quarter

        if (Dx < R & Dx > 0 & Dy < R & Dy >0){

            if ((Dx * Dy)/2 < (R * R)/2){

                System.out.println("[" + Dx + ";" + Dy + "]");
            }
        }

        //Check second quarter

        if (Dx > -R & Dx < 0 & Dy < R & Dy >0){

            if ((3.14 * Dx * Dx)< (3.14 * R * R) & (3.14 * Dy * Dy)< (3.14 * R * R) ){

                System.out.println("[" + Dx + ";" + Dy + "]");
            }
        }

        //Check third quarter

        if (Dx > -R & Dx < 0 & Dy > -R & Dy < 0){

            //Nothing
        }

        //Check fourth quarter

        if (Dx < R & Dx > 0 & Dy > -R & Dy < 0){

            if (Math.abs(Dx)< Math.abs(R) & Math.abs(Dy)< Math.abs(R/2)){


                System.out.println("[" + Dx + ";" + Dy + "]");
            }
        }
    }
}
