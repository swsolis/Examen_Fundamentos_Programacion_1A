/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author wssa8
 */
public class Aplicacion {

    public static void main(String[] args) {
        comprobarCedula();
    }

    public static void comprobarCedula() {
        Scanner leer = new Scanner(System.in);
        String ci;
        int dci, acu = 0, aux, resta;
        System.out.println("Ingresa tu numero de cédula");
        ci = leer.next();
        for (int i = 0; i <= 8; i++) {
            if (i % 2 == 0) {
                dci = Character.getNumericValue(ci.charAt(i));
                dci = dci * 2;
                if (dci >= 10) {
                    dci = dci - 9;
                    acu = acu + dci;
                } else {
                    acu = acu + dci;
                }
            } else {
                dci = Character.getNumericValue(ci.charAt(i));
                acu = acu + dci;
            }
        }

        if (acu % 10 != 0) {
            aux = (acu / 10 +1) * 10;
            resta = aux - acu;
        }else{
            aux = acu;
            resta = aux - acu;
        }
        if (Character.getNumericValue(ci.charAt(9)) == resta) {
            System.out.println("Es una cedula valida ");
        } else {
            System.out.println("NO Es una cedula valida ");
        }

    }

}
