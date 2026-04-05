public class SMSFactory extends NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
