/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_20_calculogeometrico;

/**
 *
 * @author cavil
 */
public class geometria {
    //Constantes: 
    /*Se puede usar en clases
    Se puede usar en variables
    Solo se asigna el valor una vez*/
    public static final double PI=3.1416;
    //Perimetro de un circulo
    public static double perimetro(double radio){
        return PI*radio*2;
    }
    //Area de un circulo
    public static double areacirculo(double radio){
        return PI*radio*radio;
    }
    //volumen de esfera
    public static double esfera(double radio){
        return (4.0/3.0)*PI*radio*radio*radio;
    } 
}
