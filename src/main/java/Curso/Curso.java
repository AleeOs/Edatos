/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Curso;

import java.util.Scanner;

/**
 *
 * @author 1061017158
 */
public class Curso {




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner lec = new Scanner (System.in);
final int CantidadEstudiantes = 2;
double notas [] = new double[CantidadEstudiantes];

int edades [] = new int[CantidadEstudiantes];

double suma = 0.0;




// nuevo
 for (int i = 0; i < CantidadEstudiantes; i++) {
            

            System.out.print("\n Ingrese la edad del estudiante " + (i + 1) + ": ");
            edades[i] = lec.nextInt();
        }





       for (int i = 0; i < CantidadEstudiantes; i++) {
           
           System.out.println("\n Igrese la nota");
           notas [i] = lec.nextDouble();
           suma+=notas[i];
           
           
       }
         
        System.out.println("\n La suma es: "+suma);
        System.out.println("\n Impresion de notas : ");
        System.out.println("# "+ " Nota ");
        
        for (int i = 0; i < notas.length; i++) {
        
            System.out.println(i+1 +" "+notas[i]+" ");
        }
        
         // Calcular el promedio de notas
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedioNotas = sumaNotas / CantidadEstudiantes;

        
        
       
        
        
        
        
        // Imprimir el promedio de notas
        System.out.println("\n El promedio de notas es: " + promedioNotas);
       
        
        
        
        
        
         // Imprimir las edades
        System.out.println("Edades de los estudiantes");
        for (int i = 0; i < CantidadEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + edades[i] + " años");
    }
    
        
        for (int i = 0; 1 < CantidadEstudiantes; i++){
        
        
        
        
        
        }
            
            
            
            
            
}
}