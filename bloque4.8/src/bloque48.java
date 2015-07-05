
public class bloque48 {
	
	static public void main(String[] arg) {
		int contador = 1;
		int[][] vector_uno = new int[2][2];
		int[][] vector_dos = {
				{1,2,},
				{3,4,}
		};
		boolean iguales = true;
		
		for(int i=0; i<vector_uno.length; i++){
			for(int j=0; j<vector_uno[0].length; j++) {
				vector_uno[i][j] = contador++;
			}
		}
		
		
		if(vector_uno.length == vector_dos.length) {
			if(vector_uno[0].length == vector_dos[0].length) {
				for(int i=0; i<vector_uno.length && iguales; i++){
					for(int j=0; j<vector_uno[0].length && iguales; j++) {
						if (vector_uno[i][j] != vector_dos[i][j]) {
							iguales = false;
						}
					}
				}
			} else {
				iguales = false;
			}
		} else {
			iguales = false;
		}
		
		if(iguales) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintos");
		}
		
	}
	
}
