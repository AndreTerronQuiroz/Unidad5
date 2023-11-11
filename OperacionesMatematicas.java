
package operaciones;


public class OperacionesMatematicas {

    // Método para suma
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Método para resta
    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // Método para multiplicación
    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // Método para división
    public static double dividir(double numero1, double numero2) {
        // Asegúrate de que no estás dividiendo por cero
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // NaN (Not a Number) para indicar un resultado indefinido
        }
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        double num1 = 10.5;
        double num2 = 5.2;

        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicacion: " + multiplicar(num1, num2));
        System.out.println("Division: " + dividir(num1, num2));
    }
}
