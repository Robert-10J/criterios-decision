package criterios.decision.ja;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Calculos {   
    
    public static Double calcularVE( List<Double> probabilidades, List<Double> valores) {        
        double resultados [] = new double[valores.size()];        
        double total = 0;

        for( int result = 0; result < resultados.length;  result++ ) {
            resultados[ result ] = probabilidades.get(result) * valores.get(result);
            total *= resultados[ result ];
        }        

        double valorE = Arrays.stream( resultados ).sum();
        return valorE;
    }

    public static Double calcularVA( List<Double> valores, List<Double> probabilidades,double valorE) {
        double resultados[] = new double[valores.size()];
        double total = 0;

        for( int i = 0; i <  resultados.length; i++ ) {
            double op = Math.pow(valores.get(i) - valorE, 2);
            resultados[ i ] = op * probabilidades.get(i);
        }

        double varianza = Arrays.stream( resultados ).sum();
        return varianza;
    }

    public static Double dispersion( Double valorE, Double k, Double varianza) {
        double resultado = 0;
        resultado = valorE - k * ( Math.sqrt(varianza) );
        return resultado;
    }

    public static String vaAcotada( Double k, List<Double> valoresEsperados, List<Double> varianzas ) {
        String resultado = "";        
        HashMap <Double, Double> valoresSelect = new HashMap<Double, Double>();
        for ( int i = 0; i < varianzas.size(); i++ ) {
            if ( varianzas.get( i ) <= k ) {
                valoresSelect.put( varianzas.get(i), valoresEsperados.get(i) );
            }
        }

        Map.Entry<Double, Double> maxValue = null;
        for( Map.Entry<Double, Double> value : valoresSelect.entrySet() ) {
            if( maxValue == null || value.getValue() > maxValue.getValue() ) {
                maxValue = value;
                resultado = String.valueOf(value.getValue());
            }
        }
    
        return resultado;
        //System.out.println(maxValue);
        //valoresSelect.forEach((key, v) -> System.out.println("Key: " + key + " Value: " + v ));
    }
    
    public static void addElementToArray( double val1, double val2, double val3, 
            double val4, double val5, List<Double> valores ) {
        valores.add(val1);
        valores.add(val2);
        valores.add(val3);
        valores.add(val4);
        valores.add(val5);
    }
}

