//cuando se accede a una posicion de un vector que no existe, es acceder
//a una posicion de memoria que no existe.


public class bloque44 {

	static public void main(String[] arg) {
		int[] vector1 = {2, 3, 4, 6};
		int[] vector2 = {2, 3, 4, 6, 7};
		boolean iguales = true;
		
		if(vector1.length != vector2.length) {
			iguales = false;
		}
		
		for(int i=0; i < vector1.length && iguales; i++) {
			if (vector1[i] != vector2[i]) {
				iguales = false;
			}
		}
		
		if(iguales) {
			System.out.println("Iguales.");
		} else {
			System.out.println("Distintos.");
		}
		
	}
	
}
