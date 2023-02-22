/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_11_califas;

import java.util.Scanner;

/**
 *
 * @author cavil
 */
public class EVA1_11_Califas {

    public static void main(String[] args) {
        /*91->100 A
        81->90 B
        71->80 C
        menor 70 D*/
        System.out.println(calificar(50));
    }
    public static String calificar(int cali){
        String resu="";
        if (cali>=91 && cali<100){
            resu="A";
        }else if(cali>=81 && cali<91){
            resu="B";
        }else if(cali>=71 && cali<81){
            resu="C";
        }else if(cali<71){
            resu="D";
        }
        return resu;
    }
}
