package com.mycompany.eva1_3_constructores;

/**
 *
 * @author Alonso
 */
public class cuentabancaria {
//DATOS --> ATRIBUTOS DE LA CLASE
    private String numero_de_cuenta;
    private String nombre;
    private double saldo;
    
    //CONSTRUCTOR:
    //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE (ARGUMENTOS)
    public cuentabancaria(){ //constructor default
        numero_de_cuenta = "";
        saldo = 0;
        nombre = "";
    }
    public cuentabancaria(String numcuenta, double dinero, String nuncliente ){
        numero_de_cuenta = numcuenta;
        saldo = dinero;
        nombre = nuncliente;
    }
    // METODOS --> COMPORTAMIENTO DE LA CLASE
    // LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    // MODIFICADOR DE ACCESO, VALOR DE RETORNO, NOMBRE DEL METODO (ARGUMENTOS) (IMPLEMENTACION)
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String valor){//SET
        nombre = valor;
    }
    public String getnumero_de_cuenta(){
        return numero_de_cuenta;
    }
    public void setnumero_de_cuenta(String valor){//SET
        numero_de_cuenta = valor;
    }
    public double getsaldo(){
        return saldo;
    }
    public void setsaldo(double valor){//SET
        saldo = valor;
    }
        public void imprimirdatos(){
        System.out.println("nombre: "+ nombre + " numero de cuenta " + numero_de_cuenta );
        System.out.println("saldo: " + saldo);
    }
}
