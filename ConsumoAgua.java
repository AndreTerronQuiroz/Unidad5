package consumoagua;

public class ConsumoAgua {

    public static void main(String[] args) {
        int[][] ConsumoAgua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
        };

        TotalConsumoAgua(ConsumoAgua);
        ConsumoAguaDiario(ConsumoAgua);
    }

    public static void TotalConsumoAgua(int[][] ConsumoAgua) {
        for (int i = 0; i < ConsumoAgua.length; i++) {
            int suma = 0;
            for (int j = 0; j < ConsumoAgua[i].length; j++) {
                suma += ConsumoAgua[i][j];

            }
            
            System.out.println("Total de Agua Consumida " + (i + 1) + ": " + suma);

        }
    }
    
    public static void ConsumoAguaDiario (int [][] ConsumoAgua){
        for (int j = 0; j < ConsumoAgua[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < ConsumoAgua.length; i++) {
                suma += ConsumoAgua[i][j];
                
            }
            
            
            System.out.println("Total de Consumo diario de Agua " + (j + 1)+ ": " + suma);
        }
    }

}
