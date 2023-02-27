/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_18_static;

/**
 *
 * @author cavil
 */
public class EVA1_18_Static {

    public static void main(String[] args) {
        Prueba pru1 = new Prueba();
        pru1.mensaje();
        Otra.mensajeestatico();
        System.out.println("Pi: "+Math.PI);
    }
}
class Prueba{
    public void mensaje(){ //Solo al crear objetos
        System.out.println("HOLA!!!!");
    }
}
class Otra{ 
    public static void mensajeestatico(){//Directamente de la clase
        System.out.println("HOLA (ESTATICO)!!!");
    }
}
