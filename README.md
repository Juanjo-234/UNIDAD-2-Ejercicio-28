Resolución del ejercicio N°28 de la unidad 2 de programación 2.
Este programa simula un sistema de control de acceso centralizado que gestiona múltiples mecanismos de autenticación mediante interfaces, procesando validaciones de seguridad de manera dinámica y flexible.

Clases e Interfaz Utilizadas
MetodoAutenticacion (Interfaz): Define el contrato estándar para validar credenciales principales y secundarias.
AuthPassword: Implementa la interfaz validando combinaciones de usuario y contraseña tradicionales.
AuthBiometrica: Implementa la interfaz verificando identificadores de usuario frente a firmas biométricas registradas.
AuthTokenOAuth: Implementa la interfaz validando identificadores de cliente con tokens de acceso digitales.
ServicioLogin: Clase coordinadora que recibe cualquier implementación de la interfaz para procesar el acceso del usuario de forma dinámica.
