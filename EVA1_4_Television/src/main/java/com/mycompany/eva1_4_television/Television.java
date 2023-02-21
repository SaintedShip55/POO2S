/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_television;

/**
 *
 * @author cavil
 */
public class Television {
    //atributos= estado
    private boolean power;
    private int volumen;
    private int canal;
    //metodos = comportamiento
    //constructor
    public Television(){
     power = false;
     volumen = 50;
     canal = 99;
    }
    public void cambiarPower(){
        if (power == false){
            power = true;
            System.out.println("TELEVISIÓN ENCENDIDA");
        }else {
            power = false;
            System.out.println("TELEVISIÓN APAGADA");
        }
    }
    public void subirvolumen(){
        if (power == true){
            if (volumen < 100){
                volumen = volumen+5;
                System.out.println("Volumen: "+volumen);
            }else {
                System.out.println("VOLUMEN MÁXIMO");
            }
        }
    }
    public void bajarvolumen(){
        if (power == true){
            if (volumen > 0){
                volumen = volumen-5;
                System.out.println("Volumen: "+volumen);
            }else{
                System.out.println("SIN VOLUMEN");
            }
        }
    }
    public void subircanal(){
        if (power == true){
            if (canal<100){
                canal = canal+1;
            }else{
                canal=1;
            }
            System.out.println("Canal: "+canal);
        }
    }
    public void bajarcanal(){
        if (power == true){
            if (canal>1){
                canal = canal-1;
            }else{
                canal=100;
            }
            System.out.println("Canal: "+canal);
        }
    }
}
