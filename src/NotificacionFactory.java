public abstract class NotificacionFactory {

    public abstract Notificacion crearNotificacion();

    public static NotificacionFactory getFactory(String tipo) {
        if (tipo.equalsIgnoreCase("sms")) return new SMSFactory();
        else return new EmailFactory();
    }
}