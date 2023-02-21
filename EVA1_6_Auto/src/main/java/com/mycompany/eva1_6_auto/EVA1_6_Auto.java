/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_6_auto;

/**
 *
 * @author cavil
 */
public class EVA1_6_Auto {

    public static void main(String[] args) {
        //MARCA, MODELO, PLACA; AÑO, DUEÑO.
        /* Adeudos:
        2000 o anteriores $1500, 2001-2005 $2000, 2006-2010 $2500, 2011-2015 $3000, 2016-2023 $4000*/
        Auto auto1 = new Auto();
        auto1.setMarca("Volskwagen");
        auto1.setModelo("Jetta");
        auto1.setPlaca("B3RS3RK");
        auto1.setDueño("Casca");
        auto1.setAño(2023);
        auto1.calcularAdeudo();
    }
}
