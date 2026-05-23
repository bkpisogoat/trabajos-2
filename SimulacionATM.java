public class SimulacionATM {

    public static void main(String[] args) {
        // Simulación: PIN correcto es "1234", saldo es $5000
        String pinIngresado = "1234";
        String operacion = "retirar dinero";
        double monto = 500;

        String resultado = operarATM(pinIngresado, operacion, monto);
        System.out.println("Cajero ATM: " + resultado);
    }

    public static String operarATM(String pinIngresado, String tipoOperacion, double montoARetirar) {
        String pinCorrecto = "1234";
        double saldoDisponible = 5000;
        double limiteDiario = 2000;

        if (!pinIngresado.equals(pinCorrecto)) {
            return "PIN incorrecto. Operación cancelada.";
        }

        if (tipoOperacion.equalsIgnoreCase("verificar saldo")) {
            return "Su saldo actual es de $" + saldoDisponible;
        } else if (tipoOperation.equalsIgnoreCase("retirar dinero")) {
            if (montoARetirar <= 0) {
                return "Monto inválido.";
            } else if (montoARetirar > saldoDisponible) {
                return "Operación rechazada: Fondos insuficientes.";
            } else if (montoARetirar > limiteDiario) {
                return "Operación rechazada: Supera el límite diario de retiro ($2000).";
            } else {
                saldoDisponible -= montoARetirar;
                return "Retiro exitoso de $" + montoARetirar + ". Saldo restante: $" + saldoDisponible;
            }
        } else {
            return "Operación no reconocida.";
        }
    }
}