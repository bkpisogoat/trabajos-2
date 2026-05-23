public class ClasificacionTriangulos {

    public static void main(String[] args) {
        double ladoA = 5;
        double ladoB = 5;
        double ladoC = 8;

        String resultado = clasificarTriangulo(ladoA, ladoB, ladoC);
        System.out.println("Tipo de triángulo: " + resultado);
    }

    public static String clasificarTriangulo(double a, double b, double c) {
        // Validación de existencia geométrica
        if ((a + b <= c) || (a + c <= b) || (b + c <= a) || a <= 0 || b <= 0 || c <= 0) {
            return "Los lados proporcionados no forman un triángulo válido.";
        }

        if (a == b && b == c) {
            return "Triángulo Equilátero (3 lados iguales)";
        } else if (a == b || b == c || a == c) {
            return "Triángulo Isósceles (2 lados iguales)";
        } else {
            return "Triángulo Escaleno (todos los lados diferentes)";
        }
    }
}