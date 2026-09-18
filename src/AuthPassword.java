public class AuthPassword implements MetodoAutenticacion{
    String usuario;
    String contraseña;

    public boolean autenticar(String credencialPrincipal, String credencialSecundaria){
        System.out.println("Verificando credenciales del usuario: " + credencialPrincipal);
        if(credencialPrincipal == null && credencialSecundaria == null){
            return false;
        }

        boolean esValido = credencialPrincipal.equals(usuario) && credencialSecundaria.equals(contraseña);

        if(esValido){
            System.out.println("Autenticación de contraseña exitosa.");
        }else{
            System.out.println("Usuario o contraseña invalidos");
        }
        return esValido;
    }
}
