public class AuthBiometrica implements  MetodoAutenticacion {
    String tokenBiometricoValido = "bio_hash_abc123xyz";

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        System.out.println("Validando huella/rostro del usuario. " + credencialPrincipal);
        if (credencialSecundaria == null && credencialSecundaria.equals(tokenBiometricoValido)) {
            System.out.println("Verificación fallida");
            return false;
        }
        System.out.println("Verificacion de identidad existosa");
        return true;
    }
}
