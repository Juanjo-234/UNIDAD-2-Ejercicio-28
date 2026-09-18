public class ServicioLogin {
    // Almacena la estrategia/método de autenticación a utilizar (Principio Abierto/Cerrado)
    private MetodoAutenticacion metodoAutenticacion;

    /**
     * Constructor que inyecta el método de autenticación deseado.
     * Esto permite cambiar dinámicamente entre Password, Biométrica u OAuth
     * sin modificar la lógica del servicio de login.
     */
    public ServicioLogin(MetodoAutenticacion metodoAutenticacion) {
        if (metodoAutenticacion == null) {
            throw new IllegalArgumentException("El método de autenticación no puede ser nulo.");
        }
        this.metodoAutenticacion = metodoAutenticacion;
    }

    /**
     * Permite cambiar el método de autenticación en tiempo de ejecución si es necesario.
     */
    public void setMetodoAutenticacion(MetodoAutenticacion metodoAutenticacion) {
        this.metodoAutenticacion = metodoAutenticacion;
    }

    /**
     * Procesa el acceso del usuario utilizando el método configurado.
     */
    public boolean procesarLogin(String credencialPrincipal, String credencialSecundaria) {
        System.out.println("=== PROCESANDO ACCESO DE USUARIO ===");

        // Delegamos la verificación al método de autenticación inyectado
        boolean accesoConcedido = metodoAutenticacion.autenticar(credencialPrincipal, credencialSecundaria);

        if (accesoConcedido) {
            System.out.println(">> Resultado: ¡Acceso concedido al sistema!\n");
        } else {
            System.out.println(">> Resultado: Acceso denegado. Intento fallido.\n");
        }

        return accesoConcedido;
    }
}