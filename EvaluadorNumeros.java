public class EvaluadorNumeros {

    public static void main(String[] args) {
        int numero = 15;
        String resultado = evaluarNumero(numero);
        System.out.println(resultado);
    }

    public static String evaluarNumero(int num) {
        String resultadoSigno = "";
        String resultadoParidad = "";
        String resultadoMultiplo = "";

        if (num > 0) {
            resultadoSigno = "Positivo";
        } else if (num < 0) {
            resultadoSigno = "Negativo";
        } else {
            resultadoSigno = "Cero";
        }

        if (num % 2 == 0) {
            resultadoParidad = "Par";
        } else {
            resultadoParidad = "Impar";
        }

        if (num % 3 == 0 && num % 5 == 0) {
            resultadoMultiplo = "Múltiplo de ambos (3 y 5)";
        } else if (num % 3 == 0) {
            resultadoMultiplo = "Múltiplo de 3";
        } else if (num % 5 == 0) {
            resultadoMultiplo = "Múltiplo de 5";
        } else {
            resultadoMultiplo = "No es múltiplo ni de 3 ni de 5";
        }

        return "El número " + num + " es: " + resultadoSigno + ", " + resultadoParidad + " y " + resultadoMultiplo + ".";
    }
}