/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_19_static2;

/**
 *
 * @author cavil
 */
public class EVA1_19_Static2 {
    int x=100;
    
    public static void main(String[] args) {
        //System.out.println(x);
        //mensajenoestatico();
        EVA1_19_Static2 obj = new EVA1_19_Static2();
        System.out.println(obj.x);
        obj.mensajenoestatico();
        mensajeestatico();
    }
    public void mensajenoestatico(){//No existe
        System.out.println("MENSAJE NO ESTATICO");
    }
    public static void mensajeestatico(){//Existe al iniciar el programa
        System.out.println("MENSAJE ESTATICO");
    }
    
}
