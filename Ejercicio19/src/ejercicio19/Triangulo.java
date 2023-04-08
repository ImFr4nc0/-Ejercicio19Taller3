/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

public class Triangulo {
    public static double calcularPerimetro(double l){
        double perimetro = l*3;
        return perimetro;
    }
    
    public static double calcularAltura(double l){
        double altura = Math.sqrt(3)*l/2;
        return altura;
    }
    
    public static double calcularArea(double l, double h){
        double area = l*h/2;
        return area;
    }
}
