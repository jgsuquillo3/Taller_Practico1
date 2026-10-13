/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
//bySaulGoodman
/**
 *
 * @author labesp
 */

//clase solo recibe datos :D
public class CuentaBancaria /*Titulo de clase 1*/ {
    //Atributos
        String nombre, apellido, tipocuenta;
        double saldo;
    //Constructores    
    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, String apellido, String tipocuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
    
    //Metodos
    // Inicia sin mayuscula, segunda palabra con mayuscula
        public void depositar(double monto){
            saldo = saldo + monto;
            System.out.println("Deposito Exitoso, nuevo saldo $" + saldo);
        }
        public void retirar(double monto){
            if(monto <= saldo){
                saldo = saldo - monto;
            System.out.println("Retiro Exitoso, nuevo saldo $" + saldo);
            }else{
                System.out.println("Saldo Insuficiente");
            } 
        }
        public void mostrarSaldo(){
            System.out.println("---Cuenta Bancaria---");
            System.out.println("Nombre del titular: " +nombre + " " +apellido);
            System.out.println("Tipo de cuenta: " +tipocuenta);
            System.out.println("Saldo: " +saldo);
        }
}