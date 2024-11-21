public class Mensajero {
    public void enviarMensaje(String mensaje, String destino) {
        System.out.println("Enviando correo electrónico a");
        System.out.println("Mensaje");
    }
}
public interface CanalDeComunicacion {
    void enviarMensaje(String mensaje, String destino);
}
public class CorreoElectronico implements CanalDeComunicacion {
    @Override
    public void enviarMensaje(String mensaje, String destino) {
        System.out.println("Enviando correo electrónico a");
        System.out.println("Mensaje");
    }
}

public class SMS implements CanalDeComunicacion {
    public void enviarMensaje(String mensaje, String destino) {
        System.out.println("Enviando SMS a");
        System.out.println("Mensaje");
    }
}
public class NotificacionPush implements CanalDeComunicacion {
    public void enviarMensaje(String mensaje, String destino) {
        System.out.println("Enviando notificación push a: " + destino);
        System.out.println("Mensaje: " + mensaje);
    }
}
public class Mensajero {
    - CanalDeComunicacion canal;
    public Mensajero(CanalDeComunicacion canal) {
        this.canal = canal;
    }
    public void enviarMensaje(String mensaje, String destino) {
        canal.enviarMensaje(mensaje, destino);
    }
}
