/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrepo_mario_ocampo;

/**
 *
 * @author mario
 */
public class Cuenta_bancaria {
        String numeroCuenta;
        double saldo;
        
        public void depositar(double monto){
            saldo=saldo+monto;
        }
        
        public void transaccion(Cuenta_bancaria destinatario, double monto){
            if(saldo>= monto){
               saldo = saldo - monto;
               destinatario.depositar(monto);
            }else{
                System.out.println("*no hay suficientes recursos para realizar la transferencia*");
            }
        }
        
        public double saldoActual(){
            return saldo;
        }

}
