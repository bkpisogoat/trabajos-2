public class ClasificacionRiesgo {

    public static void main(String[] args) {
        // Datos de prueba (puedes cambiarlos para probar otros casos)
        double ingresoMensual = 2500;
        String historial = "regular";
        int edad = 22;

        String resultado = evaluarRiesgo(ingresoMensual, historial, edad);
        System.out.println("Resultado de Riesgo Crediticio: " + resultado);
    }

    public static String evaluarRiesgo(double ingresoMensual, String historial, int edad) {
        if (ingresoMensual > 3000) {
            if (historial.equalsIgnoreCase("bueno")) {
                return "Bajo riesgo";
            } else if (historial.equalsIgnoreCase("regular")) {
                if (edad >= 25) {
                    return "Bajo riesgo";
                } else {
                    return "Medio riesgo";
                }
            } else { 
                return "Medio riesgo";
            }
        } else if (ingresoMensual >= 1000 && ingresoMensual <= 3000) {
            if (historial.equalsIgnoreCase("bueno")) {
                return "Bajo riesgo";
            } else if (historial.equalsIgnoreCase("regular")) {
                return "Medio riesgo";
            } else { 
                return "Alto riesgo";
            }
        } else { 
            if (historial.equalsIgnoreCase("bueno") && edad > 30) {
                return "Medio riesgo";
            } else {
                return "Alto riesgo";
            }
        }
    }
}