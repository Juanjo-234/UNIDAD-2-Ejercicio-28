void main() {
        System.out.println("--- Escenario 1: Login por Contraseña ---");
        MetodoAutenticacion authPassword = new AuthPassword();
        ServicioLogin servicioPassword = new ServicioLogin(authPassword);

        servicioPassword.procesarLogin("admin", "Secreto123*");


        System.out.println("--- Escenario 2: Login Biométrico ---");
        MetodoAutenticacion authBio = new AuthBiometrica();
        ServicioLogin servicioBiometrico = new ServicioLogin(authBio);

        servicioBiometrico.procesarLogin("user_999", "bio_hash_abc123xyz");


        System.out.println("--- Escenario 3: Login por OAuth ---");
        MetodoAutenticacion authOAuth = new AuthTokenOAuth();
        ServicioLogin servicioOAuth = new ServicioLogin(authOAuth);

        servicioOAuth.procesarLogin("oauth_token_bearer_789", "client_secret_xyz");
}
