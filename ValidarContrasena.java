public class ValidarContrasena {

    public static void main(String[] args) {
        String miPassword = "Abc1";
        String resultado = validarPassword(miPassword);
        System.out.println(resultado);
    }

    public static String validarPassword(String password) {
        String errores = "";

        if (password.length() < 8) {
            errores += "[Mínimo 8 caracteres] ";
        }
        if (password.equals(password.toLowerCase())) {
            errores += "[Falta una mayúscula] ";
        }
        if (!password.matches(".*\\d.*")) {
            errores += "[Falta un número] ";
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            errores += "[Falta un símbolo] ";
        }

        if (errores.isEmpty()) {
            return "Contraseña segura y válida.";
        } else {
            return "Contraseña insegura. Falta: " + errores;
        }
    }
}