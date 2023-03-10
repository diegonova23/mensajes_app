package org.example;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("==========");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. crear mensaje.");
            System.out.println("2. listar mensajes.");
            System.out.println("3. editar mensaje.");
            System.out.println("4. eliminar mensaje.");
            System.out.println("5. salir.");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    MensajesServicio.crearMensaje();
                    break;
                case 2:
                    MensajesServicio.listarMensajes();
                    break;
                case 3:
                    MensajesServicio.editarMensaje();
                    break;
                case 4:
                    MensajesServicio.borrarMensaje();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);

    }
}