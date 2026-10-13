/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * bysaulgoodman
 */
public class Empleado {
    //Atributos
    String nombre;
    double salarioBase = 460;
    int horasExtras;
    double salarioTotal;
    final double ValorExtra = 10;
 
    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, int horasExtras, double salarioTotal) {
        this.nombre = nombre;
        this.horasExtras = horasExtras;
        this.salarioTotal = salarioTotal;
    }
    
 
    //Metodos
    public void ingresarDatos(String nombre, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.salarioTotal = 0;
    }
 
    public void calcularSalarioTotal() {
        salarioTotal = salarioBase + (horasExtras * ValorExtra);
        System.out.println("Salario calculado para " + nombre + ": $" + salarioTotal);
    }
 
    public void mostrarDatos() {
        System.out.println("---Datos del Empleado---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salario total: $" + salarioTotal);
    }
}
 