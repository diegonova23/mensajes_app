package org.example;

import java.util.Scanner;

public class MensajesServicio {
    public static void crearMensaje() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = input.nextLine();

        System.out.println("Tu nombre");
        String nombre = input.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }
    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar:");
        int id_mensaje = input.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    public static void editarMensaje() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje.");
        String nuevoMensaje = input.nextLine();

        System.out.println("Indica el ID del mensaje a editar:");
        int id_mensaje = input.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(nuevoMensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
