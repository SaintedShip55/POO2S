/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_2_clases.java;

/**
 *
 * @author cavil
 */
public class Persona {
    //Datos --> Atributos de la clase
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //Metodos --> Comportamiento de la clase
    //Leer y escribir los atribustos de la clase
    //leer --> get
    //Escribir --> set
    //Modificador, valor de retorno, nombre metodo(argumento)(implementacion)
    public            String          getNombre(){ //get
        return nombre;
    }
    public void setNombre(String valor){ //set
        nombre = valor;
    }
    public String getApellidos(){ //get
        return nombre;
    }
    public void setApellidos(String valor){ //set
        nombre = valor;
    }
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
        edad=valor;
    }
    public char getGenero(){ //get
        return genero;
    }
    public void setGenero(char valor){ //set
        genero = valor;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre+" "+apellidos);
        System.out.println("Edad: "+edad);
        System.out.println("Género: "+genero);
    }
}
