/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_10_return;

/**
 *
 * @author cavil
 */
public class EVA1_10_Return {

    public static void main(String[] args) {
        square(10);//llamada función, sin hacer nada con el resultado
        int resultado=square(3);//llamada funcion, almacenar resutado
        System.out.println("Resultado es: "+resultado);
        System.out.println(square(5));//llamada funcion, enviando a imprimir
    }
    public static int square(int num){
        return num*num;
    }
}
