/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_02;


import java.util.Scanner;


/**
 *
 * @author Maryury
 */

// clase ejecutable ya que en esta se declara el metodo main
public class PersonaEjecutable {
    
    
    //realizacion del metodo main
    public static void main(String[] args) {
        
        
        
        System.out.println("--------datos--------------");
        // variables a peir por teclado
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca dni: ");
        String dni= sc.nextLine();
        System.out.print("Introduzca nombre: ");
        String nom= sc.nextLine();
        System.out.print("Introduzca Edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduzca Sexo: ");
        char sexo=sc.next().charAt(0);
        System.out.print("Introduzca Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Introduzca Altura: ");
        double altura = sc.nextDouble();
        
        
        
        System.out.println("\n--------Persona1-------------");
        //creacion del primer objeto con la utilizacion del parametro con todas las variables
        Persona pers1= new Persona(nom,edad,dni,sexo,peso,altura);
      
        System.out.println("datos de la persona: " + pers1);
        pers1.calcularIMC(peso, altura);
       System.out.println( "\n"+pers1.esMayorDeEdad(edad));
       
       
        System.out.println("\n--------Persona2-------------");
         //creacion del segundo objeto con la utilizacion del parametro con algunos parametros
        Persona pers2= new Persona("Maria",30,"4587698A",'M');
        System.out.println("datos de la persona: "+ pers2);
        //pers2.calcularIMC(pers2.getPeso(),pers2.getAltura());
        System.out.println( "\n"+pers2.esMayorDeEdad(pers2.getEdad()));
        
        
        System.out.println("\n--------Persona3-------------");
         //creacion del tercer objeto con la utilizacion del parametro por defecto utilizando el metodo set para darle valos a los atributos
        Persona pers3= new Persona();
        pers3.setNombre("Julio");
        pers3.setEdad(11);
        pers3.setSexo('H');
        pers3.setPeso(42.0);
        pers3.setAltura(1.45);
        System.out.println("datos de la persona: "+ pers3);
        pers3.calcularIMC(pers3.getPeso(), pers3.getAltura());
        System.out.println( "\n"+pers3.esMayorDeEdad(pers3.getEdad()));
        
       
        
    }
    
     
    
}
