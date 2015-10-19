package com.ruchyov.lab3.var1781;

import java.io.IOException;

/**
 * Created by alexey on 30/09/15.
 */
public class Dots {

    private String sx, sy;

    public  Dots (String x, String y) throws IOException {

        sx = x;
        sy = y;
    }

    String getSx(){return sx;}
    String getSy(){return sy;}
}
