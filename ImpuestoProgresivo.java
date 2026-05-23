public class ImpuestoProgresivo {

    public static void main(String[] args) {
        double ingreso = 3500;
        String resultado = calcularImpuesto(ingreso);
        System.out.println(resultado);
    }

    public static String calcularImpuesto(double ingreso) {
        if (ingreso < 0) {
            return "Error: El ingreso debe ser un número positivo.";
        }

        double impuesto = 0;

        if (ingreso <= 1000) {
            impuesto = ingreso * 0.05;
        } else if (ingreso <= 5000) {
            impuesto = ingreso * 0.10;
        } else {
            impuesto = ingreso * 0.20;
        }

        return "Para un ingreso de $" + ingreso + ", el impuesto a pagar es $" + impuesto;
    }
}