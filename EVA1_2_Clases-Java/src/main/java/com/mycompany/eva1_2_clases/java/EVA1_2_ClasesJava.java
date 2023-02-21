/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_2_clases.java;

/**
 *
 * @author cavil
 */
public class EVA1_2_ClasesJava {

    public static void main(String[] args) {
        //Creacion objeto
        //Instanciacion
        //Instanciar --> Dar memoria RAM
        //nombre de la clase, identificador =new Construccion de la clase();
        Persona perso1 = new Persona(); //Persona () es el contstructor (definir)
        /*perso1.apellidos = "Villa";
        perso1.nombre = "Charly";
        System.out.println(perso1.nombre+" "+perso1.apellidos);*/
        perso1.setNombre("Charly"); //Asignar valor
        //System.out.println(perso1.getNombre()); //Leer valor
        perso1.setApellidos("Villa");
        //System.out.println(perso1.getApellidos());
        perso1.setEdad(19);
        //System.out.println(perso1.getEdad());
        perso1.setGenero('H');
        //System.out.println(perso1.getGenero());
        perso1.imprimirDatos();
    }
}
