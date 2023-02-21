package com.mycompany.eva1_3_constructores;

/**
 *
 * @author Alonso
 */
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        cuentabancaria perso1 = new cuentabancaria("1700", 999999, "Casca");
        System.out.println(perso1.getnombre());
        System.out.println(perso1.getsaldo());
        System.out.println(perso1.getnumero_de_cuenta());
        
        cuentabancaria perso2 = new cuentabancaria("1497", 57491, "Griffit");
        System.out.println(perso2.getnombre());
        System.out.println(perso2.getsaldo());
        System.out.println(perso2.getnumero_de_cuenta());
        
        cuentabancaria perso3 = new cuentabancaria("1701", 77218, "Guts");
        System.out.println(perso3.getnombre());
        System.out.println(perso3.getsaldo());
        System.out.println(perso3.getnumero_de_cuenta());
    }
    
}
