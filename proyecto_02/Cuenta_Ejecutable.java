/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_02;

/**
 *
 * @author Maryury
 */
//CREACION DE UN ENUMERADO 
enum Estado {
    OPERATIVA, CERRADA, INMOVILIZADA, NUMEROS_ROJOS
}
//CLASE CUENTA
class Cuenta {
        //ATRIBUTOS DE LA CLASE CUENTA PRIVADOS
    private double saldo;
    private Persona titular;
    /*
    
    */
    private static String tipo;

    private Estado estados;
    
    private int codigo;
    
    private int ultimoCodigo;

    private Persona cotitulares;

        //ARRAY
    private String[] movimientos = new String[20];
    
    
    
    
        //CONSTRUCTORES
    public Cuenta() {
    }

    public Cuenta(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta(double saldo, Persona titular, String tipo) {
        this.saldo = saldo;
        this.titular = titular;
        Cuenta.tipo = tipo;
    }

    
            //METODOS GET 
    public int getCodigoCuenta(int ultimoCodigo) {
        codigo = ultimoCodigo + 1;
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public static String getTipo() {
        return tipo;
    }

    public Estado getEstados() {
        return estados;
    }

        //METODOS SET
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public static void setTipo(String tipo) {
        Cuenta.tipo = tipo;
    }

    public void setEstados(Estado titular) {
        this.estados = estados;
    }

    
        //MÉTODO INGRESO
    public void ingreso(double cantidad) {
        saldo = saldo + cantidad;

    }

            
    public void ingreso(String concepto, double... cantidad) {
       
        for (int i = 0; i < cantidad.length; i++) {
            saldo = saldo += cantidad[i];
        }
            
    }

    
        //METODO REINTEGRO
    public void reintegro(double cantidad) {

        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
    }

    public void reintegro(String concepto, double... cantidad) {
        concepto = "Reintegro en cuenta";
        for (int i = 0; i < cantidad.length; i++) {
            if (cantidad[i] <= saldo) {
                saldo = saldo - cantidad[i];

            } else {
                saldo = 0;
            }

        }
    }

    
        //METODO ADDCOTITULARES
    public void addCotitulares(String... nombres) {
          
    }
}

    //IMPLEMENTACION DE CLASE EJECUTABLE
public class Cuenta_Ejecutable {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        //c1.setTitular("Maria", 25, "23456A", 'M');
        //c1.setTitular("Maria",25,"4536745L",'M');
        c1.setSaldo(1000);
        c1.setEstados(Estado.OPERATIVA);
        c1.reintegro(null, 250);
        c1.getCodigoCuenta(564);
        
    }
}
