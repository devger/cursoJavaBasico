import java.util.Scanner;
//algoritmo de encriptacion cifrado cesar.


public class bloque46 {
	static public void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		String frase_original, frase_codificada;
		int clave;

		String abc_may = "abcdefghijklmnopqrstuvwxyz ";
		String abc_min = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		
		System.out.print("Introduce una frase: ");
		frase_original = teclado.nextLine(); //Empieza A Programar
		System.out.print("Introduce la clave: ");
		clave = teclado.nextInt();
		
		frase_codificada = "";
		
		for(int i=0; i<frase_original.length(); i++) {
			for(int j=0; j<abc_min.length(); j++) {
				if(frase_original.charAt(i) == abc_min.charAt(j)){
					if(j + clave >= abc_min.length()) {
						frase_codificada += abc_min.charAt((j+clave) % abc_min.length()); 
					} else {
						frase_codificada += abc_min.charAt(j+clave);
					}
				} else if (frase_original.charAt(i) == abc_may.charAt(j)){
					if(j + clave >= abc_may.length()) {
						frase_codificada += abc_may.charAt((j+clave) % abc_may.length()); 
					} else {
						frase_codificada += abc_may.charAt(j+clave);
					}
				}
				
			}
		}
		
		
		System.out.println(frase_codificada);
		teclado.close();
	}
}