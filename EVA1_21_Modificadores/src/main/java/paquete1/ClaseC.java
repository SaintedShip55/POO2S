/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.ClaseE;

/**
 *
 * @author cavil
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        //CLASE DEL MISMO PAQUETE
        ClaseB objb = new ClaseB();
        //objb.defaultB;
        //objb.publicB;
        
        //CLASE DEL PAQUETE2
        ClaseE obje= new ClaseE();
        //obje.publicE;
        
        //CLASE F ESTA EN OTRO PAQUETE
        //Y ES DEAFULT , ES INVISIBLE
        //ClaseF objf new ClaseF();
    }
}
class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
