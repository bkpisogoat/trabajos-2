public class TarifasTransporte {

    public static void main(String[] args) {
        double distancia = 15; // 15 km
        String tipoUsuario = "estudiante";
        String horario = "nocturno";

        double costoFinal = calcularTarifa(distancia, tipoUsuario, horario);
        System.out.println("El costo del transporte es: $" + costoFinal);
    }

    public static double calcularTarifa(double distancia, String tipoUsuario, String horario) {
        double tarifaBase = distancia * 0.50; // $0.50 por km

        if (horario.equalsIgnoreCase("nocturno")) {
            tarifaBase = tarifaBase * 1.20; // 20% de recargo
        }

        if (tipoUsuario.equalsIgnoreCase("estudiante")) {
            return tarifaBase * 0.50; // 50% descuento
        } else if (tipoUsuario.equalsIgnoreCase("adulto mayor")) {
            return tarifaBase * 0.40; // 60% descuento
        } else {
            return tarifaBase; // Paga completo
        }
    }
}