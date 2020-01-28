package idiomasistema;

import java.util.Locale;

/**
 * @author Thalita
 * 
 */

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
    
    }
    
}
