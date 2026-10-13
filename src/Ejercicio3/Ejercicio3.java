/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;

/**
 *
 * bysaulgoodman
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner(System.in);
        int op, pos;
        Libro libro[] = null;
        System.out.print("Cuantos libros desea ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("---Sistema de Biblioteca---");
            System.out.println("1. Ingreso de libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar informacion de los libros");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    libro = new Libro[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Datos libro " + (i + 1) + ":");
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Paginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();
                        String estado;
                        do {
                            System.out.print("Estado (disponible/prestado/extraviado): ");
                            estado = sc.nextLine().toLowerCase();
                        } while (!estado.equals("disponible") && !estado.equals("prestado") && !estado.equals("extraviado"));
                        libro[i] = new Libro(titulo, autor, paginas, estado);
                    }
                    break;
                case 2:
                    if (libro != null) {
                        System.out.print("Numero de libro a prestar (1-" + n + "): ");
                        pos = sc.nextInt();
                        sc.nextLine();
                        if (pos >= 1 && pos <= n) {
                            libro[pos - 1].prestar();
                        } else {
                            System.out.println("Numero de libro no valido");
                        }
                    } else {
                        System.out.println("Primero ingrese los libros");
                    }
                    break;
                case 3:
                    if (libro != null) {
                        System.out.print("Numero de libro a devolver (1-" + n + "): ");
                        pos = sc.nextInt();
                        sc.nextLine();
                        if (pos >= 1 && pos <= n) {
                            libro[pos - 1].devolver();
                        } else {
                            System.out.println("Numero de libro no valido");
                        }
                    } else {
                        System.out.println("Primero ingrese los libros");
                    }
                    break;
                case 4:
                    if (libro != null) {
                        for (int i = 0; i < n; i++) {
                            libro[i].mostrarInfo();
                        }
                    } else {
                        System.out.println("Primero ingrese los libros");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 5);
        sc.close();
    }
}
 