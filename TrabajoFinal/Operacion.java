package TrabajoFinal;

import java.util.Scanner;

public class Operacion {
    // Declarando variables
    int tipo;
    double saldoInicial;

    public void operacion(int tipo, double saldoInicial){
        Scanner sc = new Scanner(System.in);

        while (tipo != 4){
            System.out.println("\nElija la operacion que desea realizar: ");
            System.out.println("[1] Deposito");
            System.out.println("[2] Retiro");
            System.out.println("[3] Consulta de saldo");
            System.out.println("[4] Salir");
            tipo = sc.nextInt();
            switch (tipo){
                case 1: // Realiza la operacion deposito
                    System.out.println("Deposito");
                    System.out.println("--------");
                    System.out.print("Ingrese monto a depositar: ");
                    double montoDepositar = sc.nextDouble();
                    saldoInicial = montoDepositar + saldoInicial;
                    System.out.println("Cantidad depositada: " + saldoInicial);
                    System.out.println("¡Deposito exitiso!");
                    break;
                case 2: // Realiza la operacion de retiro
                    System.out.println("Retiro");
                    System.out.println("------");
                    System.out.println("Ingrese monto a retirar: ");
                    double montoRetirar = sc.nextDouble();
                    if (montoRetirar > saldoInicial){
                        System.out.println("\nLo siento, su saldo es insuficiente");
                    }else{
                        saldoInicial = saldoInicial - montoRetirar;
                        System.out.println("Cantidad retirada");
                        System.out.println("¡Retiro exitoso!");
                    }
                    break;
                case 3: // Realiza la consulta de saldo
                    System.out.println("Consulta de saldo");
                    System.out.println("-----------------");
                    System.out.println("Saldo: " + saldoInicial);
                    break;
                default:
                    System.out.println("P R O G R A M A  F I N A L I Z A D O");
            }
        }
    }
}
