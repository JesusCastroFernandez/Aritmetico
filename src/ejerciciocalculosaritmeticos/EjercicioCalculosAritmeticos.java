/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculosaritmeticos;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class EjercicioCalculosAritmeticos {

    /**
     * EJERCICIO DOS
     */
    public static void main(String[] args) {
        
        //          Declaración e Inicialización de variables 
        //----------------------------------------------
        
        // Datos de entrada
        double num1;
        double num2;
        
        // Datos salida
        double res1, res2, res3, res4;

        // Petición de datos por scanner
        Scanner teclado= new Scanner (System.in);
        
        //                Entrada  
        //----------------------------------------------
        System.out.println("Cálculos Aritméticos");
        System.out.println("--------------------");
        System.out.println("INTRODUCE DOS NÚMEROS REALES: ");
        System.out.print("PRIMER NÚMERO: ");
        num1= teclado.nextDouble();
        System.out.print("SEGUNDO NÚMERO: ");
        num2= teclado.nextDouble();
        
        //                 Procesamiento 
        //----------------------------------------------
        
        // Triple del primer número
        res1= 3.0 * num1;
        
        // Decima parte del segundo número
        res2= num2 / 10.0;

        // Cuadrado del doble la suma de ambos números
        res3= (num1*num1 * num2*num2) * 4;
        
        // Mitad del cuadrado de la suma de ambos números (de los cuadrados)
        res4= ((num1*num1 + num2*num2) - 0.5) / 1.0;
        
        //              Resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        System.out.println ("Triple del primer número: " + res1);
        System.out.println ();
        System.out.println ("Décima parte del segundo número: " + res2);
        System.out.println ();
        System.out.println ("Cuadrado del doble del producto de ambos números: " + res3);
        System.out.println ("La mitad del cuadrado de la suma de ambos números: " + res4);
        System.out.println ("---------");
        System.out.println ();
        
        System.out.println ("Fin. ¡Bye!");     
    }
}
