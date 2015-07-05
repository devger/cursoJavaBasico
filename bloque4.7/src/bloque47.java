
import java.util.Scanner;

public class bloque47 {
	static public void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int[][] vector = new int[2][2];
		
		for(int i=0; i<vector.length; i++) {
			for(int j=0; j<vector[0].length; j++) {
				System.out.print("Introduce ["+i+"]["+j+"]: ");
				vector[i][j] = teclado.nextInt();		
			}
		}
		
		System.out.println("");
		
		for(int i=0; i<vector.length; i++) {
			for(int j=0; j<vector[0].length; j++) {
				System.out.print(vector[i][j] + " ");		
			}
			System.out.println("");
		}
		
		teclado.close();
	}	
}
