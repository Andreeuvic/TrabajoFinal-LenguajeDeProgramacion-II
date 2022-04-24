package TrabajoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente("Mario Gonzales", "77889900", "mario00");
        Cliente cliente2 = new Cliente("Jesus Izique", "77889901", "jesus01");
        Cliente cliente3 = new Cliente("Andre Quispe", "77889902", "andre02");
        Cliente cliente4 = new Cliente("Piero Perez", "77889903", "piero03");
        Cliente cliente5 = new Cliente("Mikella Garcia", "77889904", "mikella04");

        // Agregando los objetos a la lista
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);

        // Ingreso de datos por pantalla
        System.out.println("New Peru Bank");

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        int veces = 0;
        do {
            for (Cliente list : clientes) {
                if (dni.equals(list.dni)) {
                    System.out.print("PASSWORD: ");
                    String password = sc.nextLine();
                    if (password.equals(list.password)) {
                        System.out.println("\nBIENVENIDO " + list.nombre);
                        veces = 3;
                    }else {
                        System.out.println("PASSWORD INCORRECTO");
                        veces += 1;
                        if (veces == 3) {
                            System.out.println("ACCESO RESTRINGIDO");
                        }
                    }
                }
            }
        } while (veces < 3);

        Operacion programa = new Operacion();
        programa.operacion(programa.tipo, programa.saldoInicial);
    }
}