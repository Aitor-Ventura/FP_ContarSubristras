package es.ulpgc.eii.strings;

/*  Aitor Ventura Delgado
    21.02.2019
    
    Crearemos un método que nos devuelva la cantidad de veces que se encuentran
    unas subristras de un String array en una String dada por parámetro.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringUtils {
    public static int count(String s1, String [] s2){
        int res = 0;    //variable a devolver
        
        for (int i = 0; i < s2.length; i++){    //recorremos el String array
            
            Pattern n = Pattern.compile(s2[i]); //Creamos un pattern para cada subristra
            Matcher m = n.matcher(s1);  //Y un matcher en la primera String dada
            
            while (m.find()){   //Cada vez que encuentre la substring en la String
                res++;  //Sumamos a res
            }
        }
        
        return res; //Y devolvemos 
    }
}