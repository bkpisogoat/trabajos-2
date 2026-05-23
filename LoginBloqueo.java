public class LoginBloqueo {

    public static void main(String[] args) {
        // Simulamos un intento de login con 2 fallos previos acumulados
        String usuario = "admin";
        String contrasena = "incorrecta";
        int intentosActuales = 2; 
        boolean cuentaBloqueada = false;

        String resultado = login(usuario, contrasena, intentosActuales, cuentaBloqueada);
        System.out.println("Resultado de Login: " + resultado);
    }

    public static String login(String usuario, String contrasena, int intentosActuales, boolean cuentaBloqueada) {
        if (cuentaBloqueada) {
            return "Acceso denegado. La cuenta está bloqueada.";
        }

        String usuarioRegistrado = "admin";
        String contrasenaRegistrada = "secreto123";

        if (usuario.equals(usuarioRegistrado) && contrasena.equals(contrasenaRegistrada)) {
            return "¡Inicio de sesión exitoso! Bienvenido.";
        } else {
            intentosActuales++;
            if (intentosActuales >= 3) {
                return "Alerta: Tres intentos fallidos. Cuenta bloqueada.";
            }
            return "Credenciales incorrectas. Intento " + intentosActuales + " de 3.";
        }
    }
}