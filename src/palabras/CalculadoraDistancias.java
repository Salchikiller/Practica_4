package palabras;

public class CalculadoraDistancias{
    /**
     * * Calcula la distancia de edició n, tal y como la expone
     * * Jurafsky entre las cadenas ` s1` y ` s2`.
     * */
    public static int calcularDistancia(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        
        // Creamos una matriz para almacenar los resultados intermedios
        int[][] dp = new int[m + 1][n + 1];
        

        // i = s1 n
        // j = s2 m
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    // Si s1 es una cadena vacía, la distancia es la longitud de s2 (inserciones)
                    dp[i][j] = j;
                } else if (j == 0) {
                    // Si s2 es una cadena vacía, la distancia es la longitud de s1 (eliminaciones)
                    dp[i][j] = i;
                } else if (s1.charAt(i-1)== s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]; //cuando son igual no cuesta nada 

                } else {
                    
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
                
                    
                    
                    
                    
 
                }
            }

           return dp[m][n]; // Este código hay que cambiarlo.
    }
}
