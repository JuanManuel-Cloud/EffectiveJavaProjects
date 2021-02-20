/*
* Resolución del reto, equilibrio de móviles
*
* https://www.aceptaelreto.com/problem/statement.php?id=104
*
* Se dice que un móvil está en equilibrio si todos sus submóviles y él mismo lo están.
* */
package com.juan.movil;
import java.util.ArrayList;
import java.util.Scanner;

public class Movil {

    public static void main(String[] args) {
        Movil movil1 = new Movil();
        Scanner escaner = new Scanner(System.in);
        ArrayList<SubMovil> submoviles = new ArrayList<SubMovil>();
        int pi, di, pd, dd;

        while (true) {
            System.out.println("Ingrese los siguientes datos de los submoviles, en el siguiente orden: pd dd pi di");
            pi = escaner.nextInt();
            di = escaner.nextInt();
            pd = escaner.nextInt();
            dd = escaner.nextInt();
            if (pi != 0 || di != 0 || pd != 0 || dd != 0)
                submoviles.add(new SubMovil(pi, di, pd, dd));
            else
                break;
        }


        if(movil1.estaEquilibrado(submoviles))
            System.out.println("SI");
        else
            System.out.println("NO");
    }
    public Boolean estaEquilibrado(ArrayList<SubMovil> submoviles){
        for (SubMovil aux : submoviles) {
            if (aux.getPi() != 0) {
                if (aux.getPi() * aux.getDi() != aux.getPd() * aux.getDd())
                    return Boolean.FALSE;
                else {
                    if (aux.getPd() != 0) {
                        if (aux.getPi() * aux.getDi() != aux.getPd() * aux.getDd())
                            return Boolean.FALSE;
                    }
                }
            }
        }
        return Boolean.TRUE;
    }
}
