/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_auto;

/**
 *
 * @author cavil
 */
public class Auto {
    private String marca;
    private String modelo;
    private String placa;
    private String dueño;
    private int año;
    public Auto(){
        marca="...";
        modelo="...";
        placa="...";
        dueño="...";
        año=0;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca=valor;
        System.out.println("LA MARCA DE AUTO ES: "+marca);
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo=valor;
        System.out.println("EL MODELO DEL AUTO ES: "+modelo);
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String valor){
        placa=valor;
        System.out.println("LA PLACA DEL AUTO ES: "+placa);
    }
    public String getDueño(){
        return dueño;
    }
    public void setDueño(String valor){
        dueño=valor;
        System.out.println("EL DUEÑO DEL AUTO ES: "+dueño);
    }
    public int getAño(){
        return año;
    }
    public void setAño(int valor){
        año=valor;
        System.out.println("EL AÑO DEL AUTO ES: "+año);
    }
    public int calcularAdeudo(){
        int adeudo=0;
        if(año<=2000){
            System.out.println("EL ADEUDO DEL AUTO ES $1500");
        }else if(año<2005){
            System.out.println("EL ADEUDO DEL AUTO ES $2000");
        }else if(año<2010){
            System.out.println("EL ADEUDO DEL AUTO ES $2500");
        }else if(año<2016){
            System.out.println("EL ADEUDO DEL AUTO ES $3000");
        }else if(año<2024){
            System.out.println("EL ADEUDO DEL AUTO ES $4000");
        }
        return adeudo;
    }
}
