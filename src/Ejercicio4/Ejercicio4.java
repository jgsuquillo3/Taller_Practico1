/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * bysaulgoodman
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int op;
        Empleado empleado[] = null;
        System.out.print("Cuantos empleados desea ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("---Sistema de Nomina---");
            System.out.println("1. Ingreso de empleados");
            System.out.println("2. Calcular salario total");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    empleado = new Empleado[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Datos empleado " + (i + 1) + ":");
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        double salarioBase = 460; 
                        System.out.print("Horas extras: ");
                        int horasExtras = sc.nextInt();
                        sc.nextLine();
                        empleado[i] = new Empleado();
                        empleado[i].ingresarDatos(nombre, salarioBase, horasExtras);
                    }
                    break;
                case 2:
                    if (empleado != null) {
                        for (int i = 0; i < n; i++) {
                            empleado[i].calcularSalarioTotal();
                        }
                    } else {
                        System.out.println("Primero ingrese los empleados");
                    }
                    break;
                case 3:
                    if (empleado != null) {
                        for (int i = 0; i < n; i++) {
                            empleado[i].mostrarDatos();
                        }
                    } else {
                        System.out.println("Primero ingrese los empleados");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 4);
        sc.close();
    }
}
 
    
    

