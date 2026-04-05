public class EmailFactory extends NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
