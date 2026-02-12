package org.yourcompany.yourproject;

public class SmsNotificador implements Notificador {
    @Override
    public void enviarNotificacion(String destino, String mensaje) {
        System.out.println("Enviando sms a " + destino + " con el mensaje: " + mensaje);
    }
}
