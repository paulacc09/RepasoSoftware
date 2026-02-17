package org.yourcompany.yourproject;

import java.util.List;

public class Prestamo {

    private Socio socio;
    private List<Ejemplar> ejemplares;

    public Prestamo(Socio socio, List<Ejemplar> ejemplares) {
        this.socio = socio;
        this.ejemplares = ejemplares;

        // Registrar el préstamo en el socio
        socio.registrarPrestamo(ejemplares.size());
    }

    public Socio getSocio() {
        return socio;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

   public void notificarCreacion(Notificador notificador) {
    String mensaje = "Préstamo creado con " + ejemplares.size()
            + " ejemplar(es). Socio: " + socio.darNombre();

    notificador.enviarNotificacion(socio.darEmail(), mensaje);  
    }
}
