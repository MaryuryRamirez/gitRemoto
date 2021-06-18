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

//crear clase persona publica 
public class Persona {
    
    //declarar las variables privadas para ser solo vistas en esta clase
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    
    //CONSTRUCTORES
    
    //Por defecto sin parametros para  inizializar las variables
    public Persona() {
        this.nombre ="";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }
        //con algunos parametros 
    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }
        //con todos los parametros
    public Persona(String nom, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nom;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

            //metodos get de todos los atributos declarados utilizados para devolver el valor del atributo
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getdni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
     //metodos set de algunos  atributos declarados utilizados para darle el valor al atributo
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     //metodo para mostrar si es mayor de edad siendo true  y lo contrario false 
    public boolean esMayorDeEdad(int edad){
       
        if(edad>=18){
        return true;
        }else{
        return false;
        }
    }
    
    
             //metodo para mostrar el genero de la persona siendo M =MUJER Y H =HOMBRE
      private void comprobarSexo(char s){
          sexo=Character.toUpperCase(sexo);
        if(s!=this.sexo){
            this.sexo= 'M';
        }else{
            this.sexo= 'H';
        }
        
    }
      
      //metodo para calcular el indice de masa corporal de la persona
      public double calcularIMC(double p, double a){
           double funcion =(p/Math.pow(a,2));
          if(funcion<20){
              System.out.print("Esta por debajo del IMC");
              return -1;
              
          }if(funcion>=20&&funcion<=25){
              System.out.print("Esta en el peso adecuado ");
              return 0;
          }else if(funcion>25){
               System.out.print("Esta en sobrepeso ");
              return 1;
          }
       return 0;
        //return funcion;
          
      }

      
      //metodo tostring para mostrar la informacion de un objeto
    @Override
    public String toString() {
        String imprimir;
        
        imprimir="Persona{"
                + "nombre=" + nombre 
                + ", edad=" + edad
                + ", dni=" + dni 
                + ", sexo=" + sexo 
                + ", peso=" + peso
                + ", altura=" + altura + '}';
        
        return imprimir;
               
    }
    
    
    
    
}
