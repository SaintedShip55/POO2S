/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_14_alcance3;

/**
 *
 * @author cavil
 */
public class EVA1_14_Alcance3 {

    public static void main(String[] args) {
        int x=100;//visible en todo por estar en el main
        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            //int x=0; ya esta declarada en el main
            System.out.println(i);
            System.out.println(x+1);
            if(i==5){
                System.out.println(x+2);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public static void Algo(int x){
        
    }
    public static void Algo2(int x){
        
    }
}
