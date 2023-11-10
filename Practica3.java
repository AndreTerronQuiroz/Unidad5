public class Practica3 {

    public static void main(String[] args) {
        double[][] calificaciones = {
                {90.5, 85.0, 78.5, 92.0},
                {88.0, 76.5, 89.0, 94.5},
                {70.0, 82.5, 91.0, 87.5}
        };

        PromedioEstudiante(calificaciones);
        PromedioMateria(calificaciones);
    }

    public static void PromedioEstudiante(double[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones[i].length;
            System.out.println("Promedio por Estudiante " + (i + 1) + ": " + promedio);
        }
    }

    public static void PromedioMateria(double[][] calificaciones) {
        for (int j = 0; j < calificaciones[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones.length;
            System.out.println("Promedio por Materia " + (j + 1) + ": " + promedio);
        }
    }
}