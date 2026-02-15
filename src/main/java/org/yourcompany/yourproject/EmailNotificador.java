package org.yourcompany.yourproject;

public class EmailNotificador implements Notificador {
    @Override
    public void enviarNotificacion(String destino, String mensaje) {
        System.out.println("Enviando correo a " + destino + " con el mensaje: " + mensaje);
    }
}
