package Logica;


public class ConversorDecimal {
	
	public static void main(String[] args) {
		
		ConversorRomano Romano = new ConversorRomano();
		String numeroRomano = "XXIIV";
		int decimal = ConversorRomano.ConverterPDecimal(numeroRomano);
		
		System.out.println("O número Romano é: "+ numeroRomano + 
							" O número decimal é: "+ decimal);
		
		
	}

}
