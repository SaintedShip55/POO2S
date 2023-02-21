/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author cavil
 */
public class Circulo {
    private double radio;
    public Circulo(){
        radio=0;
    }
    public double getRadio(double valor){
        return radio;
    }
    public void setRadio(double valor){
        radio= valor;
        System.out.println("EL RADIO ES: "+radio);
    }
    public double getDiametro(double valor){
        double diametro=0;
        diametro=radio*2;
        System.out.println("EL DIAMETRO ES: "+diametro);
        return diametro;
    }
    public double getArea(){
        double area=0;
        area=((Math.PI)*radio*radio);
        System.out.println("EL ÁREA ES: "+area);
        return area;
    }
    public double getPerimetro(){
        double peri=0;
        peri= Math.PI*2*radio;
        System.out.println("EL PERIMETRO ES: "+peri);
        return peri;
    }
}
