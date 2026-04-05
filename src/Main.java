public class Main {
    public static void main(String[] args) {

        String tipo = "sms";    //conifguracion posible del usuario
        NotificacionFactory factory = NotificacionFactory.getFactory(tipo);
        Notificacion notificacion = factory.crearNotificacion();
        notificacion.enviar("Prueba de SMS");

        tipo = "email";
        factory = NotificacionFactory.getFactory(tipo);
        notificacion = factory.crearNotificacion();
        notificacion.enviar("Prueba de email");


    }
}