public class SistemaBecas {

    public static void main(String[] args) {
        double promedio = 17.5;
        boolean ingresosBajos = true;
        int cursosDesaprobados = 0;

        String resultado = evaluarBeca(promedio, ingresosBajos, cursosDesaprobados);
        System.out.println("Resultado de Beca: " + resultado);
    }

    public static String evaluarBeca(double promedio, boolean ingresosBajos, int cursosDesaprobados) {
        if (cursosDesaprobados > 0) {
            return "Beca Denegada: Tiene cursos desaprobados.";
        }

        if (promedio >= 16 && ingresosBajos) {
            return "Beca Completa Aprobada";
        } else if (promedio >= 18 || (promedio >= 15 && ingresosBajos)) {
            return "Beca Parcial Aprobada";
        } else {
            return "Beca Denegada: No cumple con los requisitos.";
        }
    }
}