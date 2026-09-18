public class AuthTokenOAuth implements MetodoAutenticacion{
String tokenEsValido = "oauth_token_bearer_789";
String contraseñaEsperada = "client_secret_xyz";

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        System.out.println("Comprobando token de acceso externo");

        boolean esValido = credencialPrincipal != null && credencialPrincipal.equals(tokenEsValido) &&
                credencialSecundaria != null && credencialSecundaria.equals(contraseñaEsperada);

        if(esValido){
            System.out.println("Token verificafo correctamente");
        }else{
            System.out.println("Verificacion del token fallida");
        }
        return esValido;
    }
}
