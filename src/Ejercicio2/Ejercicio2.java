/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;
import java.util.Scanner;

/**
 *
 * bysaulgoodman
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
        int op;
        Vehiculo vehiculo[] = null;
        System.out.print("Cuantos vehiculos desea matricular: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("---Sistema de Matriculacion Vehicular---");
            System.out.println("1. Ingreso de vehiculos");
            System.out.println("2. Revision vehicular");
            System.out.println("3. Matricular");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
            case 1:
                vehiculo = new Vehiculo[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Datos vehiculo " + (i + 1) + ":");
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Estado: ");
                    String estado = sc.nextLine();
                    System.out.print("Anio de fabricacion: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    vehiculo[i] = new Vehiculo(marca, modelo, estado, anio);
                }
                break;
            case 2:
                if (vehiculo != null) {
                    for (int i = 0; i < n; i++) {
                        vehiculo[i].revisionVehicular();
                    }
                } 
                break;
            case 3:
                if (vehiculo != null) {
                    for (int i = 0; i < n; i++) {
                        vehiculo[i].matricula();
                    }}
                break;
            case 4:
                if (vehiculo != null) {
                    for (int i = 0; i < n; i++) {
                        vehiculo[i].mostrarDatos();
                    }
                }
                break;
        }
        } while (op != 5);
    sc.close();
    }
}
