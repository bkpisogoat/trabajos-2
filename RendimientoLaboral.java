public class RendimientoLaboral {

    public static void main(String[] args) {
        double puntualidad = 95;
        double productividad = 90;
        double cumplimiento = 92;

        String resultado = evaluarRendimiento(puntualidad, productividad, cumplimiento);
        System.out.println("Evaluación de Rendimiento: " + resultado);
    }

    public static String evaluarRendimiento(double puntualidad, double productividad, double cumplimiento) {
        double promedio = (puntualidad + productividad + cumplimiento) / 3;

        if (promedio >= 90) {
            if (puntualidad >= 85 && productividad >= 85) {
                return "Excelente";
            } else {
                return "Bueno";
            }
        } else if (promedio >= 75) {
            return "Bueno";
        } else if (promedio >= 50) {
            return "Regular";
        } else {
            return "Deficiente";
        }
    }
}