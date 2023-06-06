package Logica;

import java.util.HashMap;
import java.util.Map;

public class ConversorRomano {

	private static final Map<Character, Integer> valoresRomanos = new HashMap<>();

	static {
		valoresRomanos.put('0', null);
		valoresRomanos.put('I', 1);
		valoresRomanos.put('V', 5);
		valoresRomanos.put('X', 10);
		valoresRomanos.put('L', 50);
		valoresRomanos.put('C', 100);
		valoresRomanos.put('D', 500);
		valoresRomanos.put('M', 1000);
	}

	public static int ConverterPDecimal(String Romano) {
		int decimal = 0;

		for (int i = 0; i < Romano.length(); i++) {
			char atual = Romano.charAt(i);
			int valorAtual = valoresRomanos.get(atual);

			if (i + 1 < Romano.length()) {
				char proximo = Romano.charAt(i + 1);
				int valorProximo = valoresRomanos.get(proximo);
			
				if (valorAtual < valorProximo) {
					decimal -= valorAtual;
				}else {
					decimal += valorAtual;				
				}
			}else {
				decimal += valorAtual;
			}
			
			if (i + 2 < Romano.length()) {
				char terceiro = Romano.charAt(i + 2);
				int valor3 = valoresRomanos.get(terceiro);
				
				if (valorAtual == valor3) {
					decimal = '0';
				}
		}
			
		
		
					
		}
		return decimal;	
    }
}
