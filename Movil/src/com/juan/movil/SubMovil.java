package com.juan.movil;

import java.util.ArrayList;

public class SubMovil {
    private int[] submov_param;
    public SubMovil(int pi, int di, int pd , int dd){
        submov_param = new int[]{pi, di, pd, dd};
    }
    public int getPi(){return submov_param[0];}
    public int getDi(){return submov_param[1];}
    public int getPd(){return submov_param[2];}
    public int getDd(){return submov_param[3];}

}
