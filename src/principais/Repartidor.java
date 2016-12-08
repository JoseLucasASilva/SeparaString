package principais;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repartidor {

	private static List<String> lista =  new ArrayList<String>();
	
	public static List<String> quebraCamelCase(String frase){
		
		if(!existeCaracteresEspeciais(frase) && firstCharIsLetter(frase))
			reparteString(frase);
		
		return lista;
	}
	
	protected static void reparteString(String frase){
		Pattern pattern = Pattern.compile("([A-Z]{2,})|([A-Z]?[a-z]+)|([0-9]+)");
		Matcher matcher = pattern.matcher(frase);
		
		while(matcher.find()){
			
			if(isAcronimo(matcher.group()))
				lista.add(matcher.group());
			else
				lista.add(matcher.group().toLowerCase());
		}
	}
	
	public static boolean isAcronimo(String frase) {
		return frase.equals(frase.toUpperCase());
	}

	public static boolean firstCharIsLetter(String frase) {
		return Character.isLetter(frase.charAt(0));
	}

	public static boolean existeCaracteresEspeciais(String frase) {
		
		for( int i = 0; i < frase.length() ; i++ ){
			if(!Character.isLetterOrDigit(frase.charAt(i))) //SE NÃO FOR LETRA E NUMERO ELE RETORNA
				return true;
		}
		return false;
	}

}
