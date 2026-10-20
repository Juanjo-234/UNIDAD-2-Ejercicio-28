Este programa está diseñado para modelar y gestionar un sistema flexible de validación de identidad corporativa o de usuarios mediante múltiples mecanismos de autenticación (como contraseñas, biometría y tokens OAuth) utilizando polimorfismo, una interfaz común de autenticación y un servicio centralizado de inicio de sesión mediante programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la interfaz MetodoAutenticacion: Establece el contrato modular estándar que todo proveedor de identidad debe cumplir, declarando el método abstracto fundamental boolean autenticar(String credencialPrincipal, String credencialSecundaria).

Implementa clases concretas (AuthPassword, AuthBiometrica, AuthTokenOAuth): Heredan y ejecutan la interfaz adaptando la lógica de validación a sus respectivas tecnologías (comparación de hashes de contraseñas, análisis de correspondencia de patrones biométricos o validación de tokens contra servidores de autorización externos).

Diseña la clase ServicioLogin: Actúa como el orquestador o gestor central que mantiene una referencia a la interfaz abstracta del método de autenticación, permitiendo procesar accesos de manera desacoplada sin importar el mecanismo subyacente empleado.

Ejecuta la prueba polimórfica (main): Instancia el servicio de login, configura distintos proveedores de autenticación, simula múltiples intentos de inicio de sesión (tanto exitosos como fallidos por credenciales incorrectas) y refleja los resultados detallados por consola.
