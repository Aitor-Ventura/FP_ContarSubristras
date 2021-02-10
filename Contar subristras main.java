import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.count
     * @param input - ristra de búsqueda
     * @param pattern - subristras a buscar
     * @param expected - resultado esperado
     */
    static void test(String input, String[] pattern, int expected) {
    	// Se informa del caso que se está probando
      String aux = "{";
      
      for (int i = 0; i < pattern.length - 1; i++) {
           aux += "\"" + pattern[i] + "\",";
      }
      
      aux += "\"" + pattern[pattern.length - 1] + "\"}";
      
    	System.out.println("probando: count(\"" + input + "\" + " + aux + ")");
    	
        // Llamada al método a probar
        int result = StringUtils.count(input, pattern);
        
        // Comprobación de los resultados
        if (result != expected) {
            System.out.print(">> Resultado erróneo, deberia ser: " + expected + "");
            System.out.println(" y es: " + result + "");
        } else {
            System.out.println(">> Resultado correcto: " + result + "");
        }        
    }

    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.count
     * @param args
     */
    public static void main(String[] args) {
        String[] pattern = {"aa"};
        test("aaa", pattern, 1);
        String [] pattern1 = {"cad", "bra"};
        test("abracadabra", pattern1, 3);
    }

}
