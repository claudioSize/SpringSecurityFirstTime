# SpringSecurityFirstTime
Es mi primera vez intentando usar Spring Security.
En esta app estoy aprendiendo a utilizar los métodos de Spring Security, así como la biblioteca JWT. Por eso, no está hecho de manera rigurosa.
Creé algunos controladores para registrar y loguear usuarios. Al iniciar sesión, se devuelve un token con firma rol y una fecha de expiración.
El controlador register crea un usuario con una contraseña encriptada mediante el método passwordEncoder, usando el algoritmo de hashing bcrypt, 
y se guarda de forma que cumpla con normas estándar de seguridad.
