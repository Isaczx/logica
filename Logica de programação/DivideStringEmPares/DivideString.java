package DivideStringEmPares;

import java.util.Iterator;

import javax.naming.spi.DirStateFactory.Result;

public class DivideString {
	
	
	String texto2="abcdef";
	

	public static void main(String[] args) {
		String texto ="abcde";
		
		
		
		
		
		for (int i= 0; i< texto.length(); i +=2) {
			
			
			if (texto.length() % 2 == 1) {
				texto = texto + '_';
				String letra = String.valueOf(texto.charAt(i));
				String letra2 = String.valueOf(texto.charAt(i+1));
				
				
				System.out.println(letra + letra2);
			}else {
				String letra = String.valueOf(texto.charAt(i));
				String letra2 = String.valueOf(texto.charAt(i+1));
				
				System.out.println(letra + letra2);
			}
			
			
			
			
		}
		
	}

}
