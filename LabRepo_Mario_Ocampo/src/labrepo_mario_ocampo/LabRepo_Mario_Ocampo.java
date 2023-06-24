/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labrepo_mario_ocampo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class LabRepo_Mario_Ocampo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1) contar letras");
            System.out.println("2) cuenta bancaria");
            System.out.println("3) Rotacion de Bordes en Tres Arreglos ");
            System.out.println("4) salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Character> objetos = new ArrayList<>();
                ArrayList<Character> lista = new ArrayList<>();
                
                System.out.print("Ingrese la cadena: ");
                String cadena = sc.nextLine();

                for (int i = 0; i < cadena.length(); i++) {
                    char pos = cadena.charAt(i);
                    if (pos != ' ') {
                        objetos.add(pos);
                    }
                }
                for (char letras : objetos) {
                    if (!lista.contains(letras)) {
                        lista.add(letras);
                        int resultado = proceso(objetos, letras);
                        System.out.println(letras + "-> " + resultado);
                    }
                }
            }else{
                if(opcion==2){
                    //en el codigo no hay errores al parecer pero hay partes que no se ejecutan.
                    Scanner caja = new Scanner(System.in);
                    ArrayList<Cuenta_bancaria> cuenta = new ArrayList();
                    ArrayList<Double> saldos = new ArrayList();
                    
                    System.out.println("ingrese el numero de cuenta de la *Cuenta 1* (8 digitos)");
                    String num1=caja.nextLine();
                    System.out.println("ingrese el saldo de la cuenta 1");
                    double cantidad1 = caja.nextDouble();
                    
                    Cuenta_bancaria cuenta1 = new Cuenta_bancaria();
                    cuenta1.numeroCuenta = num1;
                    cuenta1.saldo = cantidad1;
                    cuenta.add(cuenta1);
                    saldos.add(cantidad1);
                    
                    System.out.println("ingrese el numero de cuenta de la *Cuenta 2* (8 digitos)");
                    String num2=caja.nextLine();
                    System.out.println("ingrese el saldo de la cuenta 2");
                    double cantidad2 = caja.nextDouble();
                    
                    Cuenta_bancaria cuenta2 = new Cuenta_bancaria();
                    cuenta2.numeroCuenta = num2;
                    cuenta2.saldo = cantidad2;
                    cuenta.add(cuenta2);
                    saldos.add(cantidad2);
                    
                    System.out.println("ingrese el numero de cuenta de la *Cuenta 3* (8 digitos)");
                    String num3=caja.nextLine();
                    System.out.println("ingrese el saldo de la cuenta 3");
                    double cantidad3 = caja.nextDouble();
                    
                    Cuenta_bancaria cuenta3 = new Cuenta_bancaria();
                    cuenta1.numeroCuenta = num1;
                    cuenta1.saldo = cantidad1;
                    cuenta.add(cuenta3);
                    saldos.add(cantidad3);

                    System.out.println("le gustaria crear otra cuenta? (SI-1,NO-2)");
                    int cr = caja.nextInt();
                    if (cr == 1) {
                        Scanner nueva = new Scanner(System.in);
                        System.out.println("ingrese el nombre de la cuenta: ");
                        String nombre = nueva.nextLine();
                        System.out.println("ingrese el numero de cuenta (8 digitos)");
                        String numeroCuenta = nueva.nextLine();
                        if(cuenta.contains(numeroCuenta)){
                            System.out.println("este numero de cuenta ya esta registrado");
                        }else{
                            System.out.println("ingrese el saldo de la cuenta");
                            String sald = nueva.nextLine();
                        }
                        System.out.println("su cuenta se creo con exito");
                    }

                    System.out.println("a que cuenta le gustaria depositar");
                    System.out.println("1) cuenta 1");
                    System.out.println("2) cuenta 2");
                    System.out.println("3) cuenta 3");
                    int selec = caja.nextInt();

                    if (selec == 1) {
                        
                        Scanner c1 = new Scanner(System.in);
                        System.out.println("*Cuenta 1*");
                        System.out.println("ingrese el monto que desea depositar:");
                        double monto = c1.nextDouble();
                        if(saldos.contains(monto)){
                        cuenta1.depositar(monto);
                        System.out.println("su transaccion se completo");
                        System.out.println("monto-> "+monto);
                        }else{
                            System.out.println("fondos insuficientes");
                        }
                        double Scuenta1 = cuenta1.saldoActual();
                        double Scuenta2 = cuenta2.saldoActual();
                        double Scuenta3 = cuenta3.saldoActual();
                        
                        System.out.println("Saldo cuenta 1 -> "+Scuenta1);
                        System.out.println("Saldo cuenta 2 -> "+Scuenta2);
                        System.out.println("Saldo cuenta 3 -> "+Scuenta3);
                    } else {
                        if (selec == 2) {
                            
                            Scanner c2 = new Scanner(System.in);
                            System.out.println("*Cuenta 2*");
                            System.out.println("ingrese el monto que desea depositar");
                            double monto2 = c2.nextDouble();
                            cuenta2.depositar(monto2);
                            
                        }else{
                            if(selec ==3){
                                
                                Scanner c3 = new Scanner(System.in);
                                System.out.println("*Cuenta 3*");
                                System.out.println("ingrese el monto que desea depositar");
                                double monto3 = c3.nextDouble();
                                cuenta3.depositar(monto3);
                                
                            }
                            
                        }
                        double Scuenta1 = cuenta1.saldoActual();
                        double Scuenta2 = cuenta2.saldoActual();
                        double Scuenta3 = cuenta3.saldoActual();
                        
                        System.out.println("Saldo cuenta 1 -> "+Scuenta1);
                        System.out.println("Saldo cuenta 2 -> "+Scuenta2);
                        System.out.println("Saldo cuenta 3 -> "+Scuenta3);
                    }
                }else{
                    if(opcion==3){
                        System.out.println("...");
                    }
                }
            }
        }
    }


    public static int proceso (ArrayList<Character> caracter, char res) {
        int contador = 0;
        for (char fnl : caracter) {
            if (fnl == res) {
                contador++;
            }
        }
        return contador;
    }
}

    

