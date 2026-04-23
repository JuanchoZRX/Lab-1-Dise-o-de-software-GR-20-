public class Main {
    public static void main(String[] args) {

        //Factory
        String tipo = "sms";
        NotificacionFactory factory = NotificacionFactory.getFactory(tipo);
        Notificacion notificacion = factory.crearNotificacion();
        notificacion.enviar("Prueba de SMS");

        tipo = "email";
        factory = NotificacionFactory.getFactory(tipo);
        notificacion = factory.crearNotificacion();
        notificacion.enviar("Prueba de email");


        //Composite
        Component archivo1 = new Archivo("a.txt", 100);
        Component archivo2 = new Archivo("b.txt", 200);
        Component archivo3 = new Archivo("c.txt", 300);

        Directorio carpetaDocumentos = new Directorio("documentos");
        carpetaDocumentos.agregar(archivo1);
        carpetaDocumentos.agregar(archivo2);

        Directorio carpetaPrincipal = new Directorio("principal");
        carpetaPrincipal.agregar(carpetaDocumentos);
        carpetaPrincipal.agregar(archivo3);

        System.out.println("Tamaño documentos: " + carpetaDocumentos.getSize()); // 300
        System.out.println("Tamaño total: " + carpetaPrincipal.getSize());       // 600
    }
}